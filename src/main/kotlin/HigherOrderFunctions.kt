fun main() {
    val fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(1.0,4.0))
    calculator(3.0,6.3, ::sum)

    
}

fun sum(a: Double, b: Double) : Double {
    return a+b
}

// Higher order functions are those which can take function as input or give function as output or can do both

fun calculator(a:Double, b:Double, gn: (Double,Double) -> Double){
    val result = gn(a,b)
    println(result)
}

