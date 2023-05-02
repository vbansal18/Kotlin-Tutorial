fun main() {
    var num = arrayOf(1,2,3)
    var letters = arrayOf("one", "two" , "three")
    var arr = arrayOf<Int>(3,4,5)        //Explicit declaration of array

    for((i:Int,e: String) in letters.withIndex()){
        println("$i - $e")
    }

    letters[0]="Zero"
    println(letters[0])
    println(letters.get(1))
    letters.set(1, "one")
    println(letters.get(1))
}