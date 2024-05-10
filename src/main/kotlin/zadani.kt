abstract class Shape {
    abstract fun calculateArea(): Double
}

class Circle(val radius: Double): Shape() {
}

class Rectangle(val width: Double, val height: Double): Shape() {
}
fun main() {

}
