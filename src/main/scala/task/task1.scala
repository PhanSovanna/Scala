package task

import java.util.Scanner
import scala.io.StdIn.{readLine,readInt,readFloat}

object task1
{
    def main(args: Array[String]): Unit = {

        print("Enter Item's Weight 1:")
        var weight1 = readFloat()
        print("Enter Item's Weight 2:")
        var weight2 = readFloat()
        print("Enter Number of Purchase:")
        var number_of_purchase = readFloat()
        print(f"The Calculate ${(weight1+weight2)/number_of_purchase}")

    }
}
