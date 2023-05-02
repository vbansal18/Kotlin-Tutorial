fun main() {
    var obj = Child()
    println(obj.p1)
    obj.method1()
}

//Each child class can only be inherited from a single parent class
//open keyword is used in parent class to allow it to be inherited by child class
// parent class is called before child class because child cannot exist without parent

open class Parent{
    open var p1 = 2    //"open" keyword for allowing a parent's property or method to be overridden
    init{
        println("This is parent")
    }
    open fun method1(){
        println("Method 1 of parent")
    }
}

class Child : Parent() {
    init{
        println("This is child")
    }
    fun method2(){

    }

    override var p1: Int = 25   //To make a property or method overridden
    override fun method1() {
        println("Method 1 of child")
        super.method1()         //To access member of parent class from overridden member
    }
}