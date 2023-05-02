fun main() {
    val nums = listOf<Int>(1,2,3,4)
    println(isOdd(2))
    println(isOdd(3))
//    val list = nums.filter(::isOdd)

//    Same as

//    val list = nums.filter(fun(a:Int):Boolean{
//        return a%2==1
//    })

//same as

//    val list = nums.filter { a: Int -> a % 2 == 1 }

//    same as

    val list = nums.filter { it % 2 == 1 }
    println(list)

}

fun isOdd(a:Int):Boolean{
    return a%2==1
}