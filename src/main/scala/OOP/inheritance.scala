package OOP


trait A{

}

trait B{

}

trait C{

}

trait d{
    private var a = 10
    def getA()={
        a + 10
    }
}

class e extends A with B with C with d
{

}


object inheritance {
    def main(args: Array[String]): Unit = {
        // val = final variable
        val obj = new e()
        print(obj.getA())
    }
}
