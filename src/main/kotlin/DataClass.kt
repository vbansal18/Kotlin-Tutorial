//fun main() {
//    val p1 = Persons(1, "Vaibhav")
//    val p2 = Persons(1, "Vaibhav")
//    println(p1)
//    println(p2)
////    Objects p1 and p2 have addresses which are being compared (p1==p2)
////    Output -> false because addresses are different
//    println(p1==p2)   //same as p1.equals(p2)
//
//}
////This will create objects which point to different locations in memory
//class Persons(val id:Int, val name: String){
//
//}

fun main() {
    val p1 = Persons(1, "Vaibhav")
    val p2 = Persons(1, "Vaibhav")
//    Here when an object is passed in println, it gives the address pointing to the memory location
//    But if the class is data class, then toString(), equals(), etc. methods are overridden
//    Now objects of data class are not addresses pointing to location, they are
//    println(p1)
//    println(p2)
//    println(p1==p2)


//    Some utility functions
//    Copy function
    val p3 = p1.copy()
    println(p3==p1)
    val p4 = p3.copy(name="Varun")
    println(p4)

//    Destructuring
    var (ID, Name) = p1     // Copying respective values to the variables on the left side
    println(ID)
    println(Name)
    ID = 5

//    Component
    println(p1.component2())   //Second argument of component
    println(p1.component1())   //First argument of component
}

data class Persons(val id:Int, val name: String){

}
