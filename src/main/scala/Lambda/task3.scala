package Lambda

object task3 {

    def main(args: Array[String]): Unit = {
        var volume = (pi:Float,r3:Float) => (4/3.0) * pi * r3
        print(f"Volume of a sphere: ${volume(3.14f,3.0f)}")
    }
}
