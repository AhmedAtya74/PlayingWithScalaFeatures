package Demo

import scala.io.StdIn._

object Demo {


  def main(args: Array[String]): Unit = {

    // Int => 32 bit
    val anIntegar:Int = 5;
    println(anIntegar)

    // Short => 16 bit
    val aShort:Short = 30000
    println(aShort)

    // Long => 64 bit
    val aLong:Long = 1000000000


    // Float => 32 bit IEEE
    val aFloat:Float = 2.8
    println(aFloat)


    // Double => 64 bit IEEE
    val aDouble:Double = 351221332.0023366
    println(aDouble)

    // Char => 16Bit
    val aChar:Char = 'A'
    print(aChar)

    // String => sequence of Char

    val aString:String = "Written by Ahmed Atya!"
    println(aString)


    // Null => null or empty rederance
    // Nothing => subtype of every subtype
    // AnyRef => superType of any referance type

  }

}
