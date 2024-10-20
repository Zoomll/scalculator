package  org.zoomll.scalculator

object  calc:
  def add(a:Double,b:Double): String =
    val ans:Double = a + b
    ans.toString

  def sub(a:Double,b:Double): String =
    val ans:Double = a - b
    ans.toString

  def mult(a:Double,b:Double): String =
    val ans:Double = a * b
    ans.toString

  def divi(a:Double,b:Double): String =
    if b != 0.toDouble then
      val ans:Double = a / b
      ans.toString
    else
      "undefined"






