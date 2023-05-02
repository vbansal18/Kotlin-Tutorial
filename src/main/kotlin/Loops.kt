fun main() {
    var num = 2
    var index =1
//    while(index<11){
//        println("$num x $index = ${num*index}")
//        index++
//    }

//    do {
//        println("$num x $index = ${num*index}")
//        index++
//    }
//    while (index<11)

//    for(index in 1..10){
////        println(num.toString() + " x " + index + " = " + num*index)
////        String Templating
//        println("$num x $index = ${num*index}")
//    }

    for(index in 1..10 step 2){          // step 2 skips every 2nd element
        println(index)
    }

}