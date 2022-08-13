 class MovablePoint(var x: Int, var y: Int, var xSpeed: Int, var ySpeed: Int) :Movable {





     override fun moveUp() {
y-=ySpeed
    }

    override fun moveDown() {
x+=xSpeed
    }

    override fun moveLeft() {
y+=ySpeed
    }

    override fun moveRight() {
x-=xSpeed
    }


}