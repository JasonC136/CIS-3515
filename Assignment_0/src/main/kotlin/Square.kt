class Square(_name: String): Shape(_name) {
    //Initializing Variables
    var length: Double = 0.0
    var height: Double = 0.0

    //Setting Length and Height of Square
    fun setDimensions(length: Double, height: Double ){
        this.length = length
        this.height = height
    }

    override fun printDimensions(){
        println("\tThis is a $name, it has a lenght of $length and a height of $height.")
    }

    //Rewriting getArea Function for Squares
    override fun getArea(): Double {
        return length * height
    }

}