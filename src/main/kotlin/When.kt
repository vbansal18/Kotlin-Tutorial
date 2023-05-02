fun main() {
    var animal = "dog"
//    if(animal=="horse"){
//        println("Animal is horse")
//    }
//    else if(animal=="cat"){
//        println("Animal is cat")
//    }
//    else if(animal=="dog"){
//        println("Animal is dog")
//    }
//    else{
//        println("Animal not found")
//    }


//    Alternative of switch statement in kotlin
//    when(animal){
//        "horse"-> println("Animal is horse")
//        "cat"-> println("Animal is cat")
//        "dog"-> println("Animal is dog")
//        else-> println("Animal not found")
//    }

//      Using when as an expression
    var result = when(animal){
        "horse"-> "Animal is horse"
        "cat"-> "Animal is cat"
        "dog"-> "Animal is dog"
        else-> "Animal not found"
    }
    println(result)
}