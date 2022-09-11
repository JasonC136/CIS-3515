class Circle(_name: String): Shape(_name) {
    //Initializing Variables
    var radius: Double = 0.0

    //Setting Radius of Circle
    fun setDimensions(radius: Double){
        this.radius = radius
    }

    override fun printDimensions(){
        println("\tThe radius of this $name is $radius.")
    }

    //Rewriting getArea Function for Circle
    override fun getArea(): Double {
        return radius * radius * 3.14
    }
}