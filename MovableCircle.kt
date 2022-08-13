 class MovableCircle(
     var x: Int,
     var y: Int,
     var xSpeed: Int,
     var ySpeed: Int,
     var radius: Int,
     var center: MovablePoint?
 ):Movable {


     override fun moveUp() {
       center!!.y-=ySpeed


    }

    override fun moveDown() {
        center!!.x+=xSpeed

    }

    override fun moveLeft() {
        center!!.y-=ySpeed

    }

    override fun moveRight() {
        x-=xSpeed

    }
}