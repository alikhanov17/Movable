fun main() {
    val m1: Movable = MovablePoint(5, 6, 10, 15) // upcast

    println(m1.toString())
    m1.moveLeft()
    println(m1.toString())

    val m2: Movable = MovableCircle(1, 2, 3, 4, 20, null) // upcast

    println(m2)
    m2.moveRight()
    println(m2)
}