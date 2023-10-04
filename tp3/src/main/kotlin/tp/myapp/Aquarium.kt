package tp.myapp
import java.lang.Math.PI
fun main() {
    buildAquarium()

}
open class Aquarium (var length: Int = 100, var width: Int = 20, open var height: Int = 40) {
    /*var width: Int = 0
    var height: Int = 40
    var length: Int = 100
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100*/
    init {
        println("aquarium initializing")

    }

    open var volume: Int
        get() = width*height*length/1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape ="cylinder"
    open var water = volume * 0.8



    fun printSize() {
        println(shape)
        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm ")
        println("Volume: $volume liters : $water liters (${water / volume *100.0}% full")

    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish *2000*1.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}
fun buildAquarium() {
   /* val myAquarium = Aquarium ()
    myAquarium.printSize()
    val myAquarium = Aquarium ()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
    val aquarium1 = Aquarium ()
    aquarium1.printSize()
    //default height and length
    val aquarium2 = Aquarium (width = 25)
    aquarium2.printSize()
    //default width
    val aquarium3 = Aquarium (height = 25, length = 110)
    aquarium3.printSize()
    //everything custom
    val aquarium4 = Aquarium (width = 25, height = 35, length = 110)
    aquarium4.printSize()
    val aquarium6 = Aquarium(length = 25 , width = 25 , height = 40)
    aquarium6.printSize()*/


}