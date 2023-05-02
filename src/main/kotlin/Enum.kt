fun main() {
    val day = Day.MONDAY
    day.printFormattedDay()
}
//Used so that object take values defined in this class only, not any random value
enum class Day(val num:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay(){
        println("Day is $this")   //this -> means it points to the value of current object of this class
    }
}