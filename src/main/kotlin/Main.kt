import java.util.*


fun shouldChangeWater() {
    TODO("Not yet implemented")
}

fun main(args: Array<String>) {
/*
   println("Hello World!")

   val isUnit = println("this is an expression")
   println(isUnit)

   val temperature = 10
   val isHot = if(temperature > 50) true else false
   println(isHot)

   val temperature = 10
   val message = "the temperature is ${ if (temperature > 50) "too warm" else " zouk" }."
   println(message)
 */
    feedTheFish()
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter


    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")

    println("-----")
    println("Flat: ${mylist.flatten()}")

    /*var dirtyLevel = 20*/
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
    /*val waterFilter =  { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))*/

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    println(updateDirty(15, ::increaseDirty))






}

fun feedTheFish() {
val day = randomDay()
val food = fishFood(day)
println ("Today is $day and the fish eat $food")
println("Change water: ${shouldChangeWater(day)}")
}
fun randomDay() : String {
val week = arrayOf("Monday" , "Tuesday" , "Wednesday" , "Thursday" ,"Friday" , "Saturday" , "Sunday" )
return week [Random().nextInt(week.size)]
}
fun fishFood (day :String) : String {

/*  when (day) {
    "Monday" -> food = "flakes"
    "Tuesday" -> food = "pellets"
    "Wednesday" -> food = "redworms"
    "Thursday" -> food = "granules"
    "Friday" -> food = "mosquitoes""Saturday" -> food = "lettuce"
     "Sunday" -> food = "plankton"
    }*/
return when(day) {
    "Monday" ->  "flakes"
    "Wednesday" ->  "redworms"
    "Thursday" -> "granules"
    "Friday" -> "mosquitoes"
    "Sunday" ->  "plankton"
    else ->  "nothing"
}
}
fun swim(speed: String = "fast") {
println("swimming $speed")
}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
/*return when {
    temperature > 30 -> true
    dirty > 30 -> true
    day == "Sunday" ->  true
    else -> false*/
return when {
    isTooHot(temperature) -> true
    isDirty(dirty) -> true
    isSunday(day) -> true
    else  -> false

}
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"


val mysports = listOf("basketball", "fishing", "running")
val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
val mylist = listOf(mysports, myplayers, mycities)     // list of lists


val waterFilter: (Int) -> Int = { dirty -> dirty
}
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
return operation(dirty)
}
fun increaseDirty( start: Int ) = start + 1





