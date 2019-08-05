package task

import scala.io.StdIn.readInt

object task4 {
    def main(args: Array[String]): Unit = {
        // one month have 30 day so one year has 12 * 30 = 360 days
        print("Enter Days:")
        var day = readInt()
        var d = 0
        var m = 0
        var y = 0
        var i = 1
        while (i < day+1) {
            // if day equal 30 it mean one month increase
            if(d > 29)
            {
                m += 1
                d -= 30
                // if month equal 12 it mean one year increase
                if(i > 364) {
                    y += 1
                    m -= 12
                }
            }
            d += 1
            i += 1
        }
        println(s"Years = $y")
        println(s"Month = $m")
        println(s"Day = $d")
    }
}
