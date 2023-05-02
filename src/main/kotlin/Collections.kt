fun main() {
//    List : Mutable and immutable(default - > listOf)


//    By default: listOf is immutable, its size cannot be changed just like that of arrays
//    Difference between list and  array is that elements of list cannot be changed while elements of array can be reassigned
    var nums = listOf<Int>(1,2,3,4)
    println(nums.indexOf(3))
    println(nums.contains(43))



//    nums[1]=4       //   element can't be changed

//    Mutable Lists
    var mutableNums = mutableListOf<Int>(5,6,7,8)
    mutableNums.add(9)     //   new element can be added and thus size is changed.
    mutableNums.addAll(nums)            //  nums collection is added to the mutableNums through addAll method
    println(mutableNums)






//    Maps  :  Mutable and immutable(default - > maps)
//    Key value pairs store
    val mp = mutableMapOf<Int, String>()
    mp.put(1,"Ryan")
    mp.put(2,"Vaibhav")
    mp[1]="Varun"
    mp.put(3,"Bansal")
    println(mp)
    println(mp.get(2))
    println(mp.get(5))

    for (i in mp){
        println("${i.key} = ${i.value}")
    }
//    to is used to initialise immutable map
    val map = mapOf<Int, String>(1 to "Vaibhav", 2 to "Bansal", 3 to "Kumar")
    println(map)
//    map[1]="Varun"


}