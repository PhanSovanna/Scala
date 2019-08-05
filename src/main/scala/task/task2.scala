package task

import scala.io.StdIn.{readFloat,readLine,readInt}


object task2 {
    def main(args: Array[String]): Unit = {
        var employee_id = ""
        var total_work_hour = 0
        var amount_hour = 0.0f
        print("Enter employee_id:")
        employee_id = readLine()
        print("Enter total work hour:")
        total_work_hour = readInt()
        print("Enter amount hour:")
        amount_hour = readFloat()
        println(s"Employee ID:$employee_id")
        println(f"Salary ${total_work_hour*amount_hour}%.2f $$")
    }
}
