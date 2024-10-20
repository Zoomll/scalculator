package  org.zoomll.scalculator

object  calc:
  def add(a:Double,b:Double): Double = a + b

  def sub(a:Double,b:Double): Double = a - b

  def mult(a:Double,b:Double): Double = a * b

  def divi(a:Double,b:Double): Double =
    if b != 0.toDouble then
      val ans = a / b
    else println("Error: Divide by 0 is not possible")
    
    ans
    
  

    
  
  