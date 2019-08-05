package Lambda

object task2 {
    def main(args: Array[String]): Unit = {
        var area = (b1:Int,b2:Int,h:Int) => (b1 +b2) * h/2.0f
        print(f"Area of a trapezoid: ${area(1,1,1)}")
    }
}
