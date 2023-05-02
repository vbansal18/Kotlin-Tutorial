fun main() {
    val arr = arrayOf(1,3,5,6)
    val age = -4
//In try, we write the code which has chances of exceptions or errors
//    So that by this, we do not encounter any kind of crashes
    try{
        println(arr[6])
    }

//    In catch, we write the code which is to be displayed after getting exceptions in try block

    catch(e : ArrayIndexOutOfBoundsException) {
        println("Array index is out of bounds. Please check it again.")
    }


//    There can be multiple catch blocks. Sequence should be such that the first few catch blocks should be identified as for specific exceptions
//    the last catch block should be of the base class

    catch(e : Exception) {
        println("Exception occurs.")
    }

//    This code will execute no matter what
    finally {
        println("This code will execute no matter what")
    }

//    There is another class also whose name is throw. This block contains code on whose execution, error exception is to be displayed.
//    Without it, no exception occurs but if user wants to show some error, throw is used
    if(age<0) {
        throw IllegalArgumentException("Age must be greater than zero")
    }
}
