package Demo

import scala.io.StdIn._

// singleton object.
object Demo {

  def main(args: Array[String]): Unit = {
    NextDemo.goodBye()
  }

}

// singleton object.
object  NextDemo {

  def goodBye(): Unit = {
    println("GoodBye, Ahmed!")
  }
}
