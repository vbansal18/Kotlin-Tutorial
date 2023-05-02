fun main() {

    val circle = Circle(4.0)
    println(circle.area())
}

//abstract members are those which are not yet defined but will be defined by the inheriting classes.
//We cannot make any object or instance of an abstract class
//All abstract members of abstract class should be implemented in child class
//Abstract members should bot be initialised in block because they are not defined till now
//If any member is declared abstract, then entire class need to be declared abstract
//an abstract class may have both abstract and non-abstract members

abstract class Shape1(){
    var name : String = ""
    abstract fun area() : Double
    abstract fun display()
}

class Circle1(val radius : Double): Shape1(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
    override fun display() {
        println("This is a circle being displayed")
    }
}