package Lambda

object task4 {
    def main(args: Array[String]): Unit = {
        var volume = (pi:Float,r2:Float,height:Float) => pi*r2*height
        print(volume(3.14f,3,4))
    }
}
