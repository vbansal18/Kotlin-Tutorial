fun main() {
    println(obj1.num)
    println(obj2.p)
    obj2.test()
}
//Object and class are created at once
//No constructors are allowed (init block is allowed)
//Singleton pattern
//You can inherit class/ interface
object obj1{
    val num: Int = 12
}

object obj2{
    val p:Int = 23
    fun test(){
        println("This is object 2")
    }
}