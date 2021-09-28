package Demo

import scala.io.StdIn._

// singleton object.
object Demo {

  def main(args: Array[String]): Unit = {
    val wel = new Demo() // companion class
    wel.welcome()
    NextDemo.goodBye()
  }

}

// singleton object.
object  NextDemo {

  def goodBye(): Unit = {
    println("GoodBye, Ahmed!")
  }
}
// companion class
class Demo{
  def welcome(): Unit ={
    println("Welcome, Ahmed!")
  }
}
