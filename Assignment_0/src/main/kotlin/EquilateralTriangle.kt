class EquilateralTriangle(_name: String): Triangle (_name) {
    //Initializing Variables
    var Side: Double = 0.0

    //Setting Side of a Eqal Triangle
    fun setDimensions(_side: Double) {
        this.Side = _side
        super.setDimensions(Side, Side, Side)
    }

    override fun printDimensions(){
        println("\tThis is a $name all of it's sides are $Side.")
    }

}