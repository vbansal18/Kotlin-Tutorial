fun main() {
    MyClass.f()   //Using f directly from companion object
    MyClass.AnotherObject.g()   //Not companion object
    MyClass.f()
}

//A class can use members of companion objects as if they are of the class

class MyClass private constructor(){  // private constructor -> Now MyClass can't be created alone, some method is needed to be defined
    companion object MyObject{

//      The function f is being called after creating an object of MyClass behind the scenes.
//        static method in java can be called directly from the class without creation of its object
//        So we use @JVMStatic for the function in kotlin to be treated as static function when called from any java file
        @JvmStatic
        fun f(){
            println("Hello I am f from object")
        }
    }


// There can only be one companion object in one class

    /*companion*/ object AnotherObject{
        fun g(){
            println("Hello I am g from another object")
        }
    }
}