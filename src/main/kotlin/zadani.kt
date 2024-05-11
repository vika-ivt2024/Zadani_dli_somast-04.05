// Базовый абстрактный класc Shape
abstract class Shape {
    // Абстрактный метод для вычисления площади фигуры
    abstract fun calculateArea(): Double
}
// Подкласс Circle, представляющий круг
class Circle(val radius: Double): Shape() {
// Переопределите метод calculate Area(), чтобы он возвращал площадь круга
override fun calculateArea(): Double {
    return 3.14 * (radiu * radiu)
}

}
// Подкласс Rectangle, представляющий прямоугольник
class Rectangle(val width: Double, val height: Double): Shape() {
// Переопределите метод calculate Area(), чтобы он возвращал площадь прямоугольника
override fun calculateArea(): Double {
    return width * height
}
}
fun main() {
    print("Площадь круга\n")
    print("Введите радиус: \n")
    val radius = readLine()
    print("S = ${circle.calculateArea()}")

    print("Площадь прямоугольника\n")
    print("Введите x: \n")
    val width = readLine()
    print("Введите y: \n")
    val height = readLine()
    print("S= ${rectangle.calculateArea()}")

// Создайте экземпляр круга и прямоугольника
// Выведите площади фигур

}