fun main() {
    var car = Automobile("Honda", 4, 6, "Petrol")
    var car2 = Automobile("Audi", "Diesel")
    car.engineType
    car2.engineType
    var p1 = person("A", 23)
    var p2 = person("B", 14)
    p1.age
    p1.name
    p2.age
    p2.name
}

class Automobile(val name: String, val tyres:Int , val maxSeating:Int, val engineType:String){   //hasAirbags doesn't have val or var, so it is not a property
    fun drive(){}
    init {
        println("Object is created.")
    }
    fun applyBrakes(){}
    init {
        println("Second init is executed.")
    }


//  *******  Secondary constructor   *******
    constructor(nameParam: String, engineParam: String) :
        this(nameParam, 4, 5, engineParam)


}

class empty{}


// To make parameters as properties, put var or val in front of them.
class person(nameParam:String, ageParam: Int){
    val name:String = ""
    val age : Int = 0
}