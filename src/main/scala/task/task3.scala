package task

import scala.io.StdIn.{readInt}

object task3 {
    def main(args: Array[String]): Unit = {
        print("Enter Number 1:")
        var x = readInt()
        print("Enter Number 2:")
        var y = readInt()
        print("Enter Number 3:")
        var z = readInt()
        print(s"Max is ${if(x>y) if(x>z) x else z else if(y>z) y else z}")
    }
}
