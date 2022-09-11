import kotlin.math.sqrt

open class Triangle(_name: String): Shape(_name) {
    //Initializing Variables
    var Side1: Double = 0.0
    var Side2: Double = 0.0
    var Side3: Double = 0.0

    //Setting Sides of a Triangle
    fun setDimensions(_Side1: Double, _Side2: Double, _Side3: Double){
        this.Side1 = _Side1
        this.Side2 = _Side2
        this.Side3 = _Side3
    }

    override fun printDimensions(){
        println("\tThis $name has 3 sides being $Side1, $Side2 and, $Side3.")
    }

    //Rewriting getArea Function for Triangle
    override fun getArea(): Double {
        var S: Double = (Side1 + Side2 + Side3) / 2
        return sqrt(S * (S - Side1) * (S - Side2) * (S - Side3))
    }

}