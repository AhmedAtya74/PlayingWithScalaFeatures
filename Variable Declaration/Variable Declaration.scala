package Demo

import scala.io.StdIn._

object Demo {


  def main(args: Array[String]): Unit = {

    // val => Const [preferred in scala]

    val aString:String = "Scala"

    println(aString)

    aString = "Java" // error => Reassignment to val aString


    var anInt:Int  = 10
    println(anInt)

    anInt = 20
    println(anInt)


    // U don't needs to write data type for each varaible, Scala compilar is smart enough to know suitable data type

    var aDouble = 30.16658
    print(aDouble)







  }

}
