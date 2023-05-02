fun main() {
    val lambda1: (Int, Int) -> Int = { x: Int, y:Int -> x+y}


    val multiLineLambda = {
        println("Hello lambda")
        val a : Int =23
//        In the last line, whichever data type is there of the expression, is the return type of the lambda function
    "This is the string data type"
        a
    }

    println(multiLineLambda())

    val singleParam1 : (Int) -> Int = {x:Int -> x+x}
//    If there is a single parameter lambda, then we don't need to define its variable, instead we can use "it" pointing to the parameter
    val singleParam : (Int) -> Int = {it+it}
}

//Lambdas are anonymous functions, they are regular functions, but they do not have any name
