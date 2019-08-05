package Lambda

object task1 {
    def main(args: Array[String]): Unit = {
        var result = (u: Int,t:Int,a:Int) => u*t+1/2.0*a*t*t
        print(result(1,1,1))
    }
}
