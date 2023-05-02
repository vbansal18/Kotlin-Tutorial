//fun main() {
////    val obj = Calculator()
////    println(obj.add(2,3))
//
//}

//class Calculator{
////    To be initialised later on
//    lateinit var digit : String
//    fun add( a:Int,  b:Int) : Int{
//        return a+b
//    }
//    fun multiply( a:Int,  b:Int) : Int{
//        return a*b
//    }
//}



//Getters and setters

fun main() {
    val p1 = Person("Vaibhav", 22)
    println(p1.name)
    p1.age=-12
    println(p1.age)
}

class Person(nameParam : String ,ageParam:Int){
    var name: String = nameParam
    get() {
        return field.uppercase()
    }

    var age:Int = ageParam
    set(value) {
        if(value>0) {
            field = value
        }
        else{
            println("Age can't be negative")
        }
    }
}