import java.lang.Math.pow

fun main() {

//    println(add(5.0,6.3))
//    println(add(5,6))
//    println(add(num2=5,num1=6))        //Named arguments
//
//
////    evenOrOdd(1)
//    printMessage(5)     // count->argument
//    printMessage()


//    function to be stored in a variable
    var fn = ::add
    println(fn(2.0,4.0))
    fn = ::power
    println(fn(3.3, 4.0))

}



//Function overloading

//fun add(num1 :Int, num2:Int) : Int
//{
//    val sum:Int
//    sum = num1+num2
//    return sum
//}

fun add(num1 :Double, num2:Double) : Double
{
    val sum:Double
    sum = num1+num2
    return sum
}

fun power(num1 :Double, num2:Double) : Double
{

    return pow(num1, num2)
}





////Inline functions
//fun add(num1 :Int, num2:Int) = num1+num2




//// By default, return type is unit type if no return type is defined
//fun evenOrOdd(num1 : Int) : Unit{
//    val result = if(num1%2==0) "even" else "odd"
//    println(result)
//    return result
//}





fun printMessage(count: Int = 2){       // count-> parameter
//    count=4                 //Parameters cannot be reassigned
    for(i in 1 until count){
        println("Hello world")
    }
}