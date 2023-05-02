fun main() {
    val shape : Shape = Shape()
    val square : Shape = Square(6.0)
    val circle : Shape = Circle(5.0)
    val triangle : Shape = Triangle(4.0, 5.0)
    printArea(square)
    printArea(circle)
    printArea(triangle)

}

fun printArea(shape:Shape){
    println(shape.area())
}

open class Shape(){
    open fun area() :Double = 0.0
}

class Circle(val radius:Double):Shape(){
    override fun area():Double = Math.PI*radius*radius
}

class Square(val side:Double):Shape(){
    override fun area():Double = side*side
}

class Triangle(val base:Double, val height:Double):Shape(){
    override fun area():Double{
        return 0.5*base*height
    }
}

