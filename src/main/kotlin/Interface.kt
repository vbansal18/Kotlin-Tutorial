fun main() {
    dragObject(arrayOf(circle(4.5), square(3.0), triangle(3.0,4.0), Player("Smiley")))
}

fun dragObject(objects:Array<Draggable>){   //  Array<Draggable> can be written in place of Array<shape> because now we can pass all those objects whose behaviour is draggable
    for(i in objects){
        i.drag()
    }
}

//an interface behaves as an abstract class.
//An interface provides same behaviour to different classes whose parent need not be same.
//Same as abstract class but since a chile can't have two parents in kotlin, it can have an interface
interface Draggable{
    fun drag()
}

abstract class shape : Draggable{
    abstract fun area() : Double
}

class circle(val radius : Double): shape(){
    override fun area(): Double = Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")

}

class square(val side : Double): shape(){
    override fun area(): Double = side * side
    override fun drag() = println("Square is dragging")
}

class triangle(val base : Double, val height : Double): shape(){
    override fun area(): Double = base*height*0.5
    override fun drag() = println("Triangle is dragging")
}

class Player(val name:String): Draggable{
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hey! my name is $name")
}