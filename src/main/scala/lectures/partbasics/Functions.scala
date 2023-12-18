package lectures.partbasics

object Functions extends App{

  def aFunction(a: String,b: Int): String = {
    a + " " + b
  }

  def aRepeatedFunction(aString: String, n: Int): String ={
    if(n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunctions(n: Int): Int ={
    def aSmallerFunction(a: Int , b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  def aFactorial(num: Int): Int = {
    if(num == 1) num
    else num * aFactorial(num - 1)
  }

  println(aFactorial(5))

  def aFibonacciFunc(a: Int): Int ={

    if(a <= 2) 1
    else aFibonacciFunc(a-1)+aFibonacciFunc(a-2)
  }

  println(aFibonacciFunc(8))

  def anotherFibonacciSeries(a: Int,b: Int,n: Int): Unit = {
    if(n>0){
      print(a + " ")
      anotherFibonacciSeries(b, a+b, n-1)
    }
  }

  anotherFibonacciSeries(1,1,8)


  def aCheckPrimeFunc(a: Int, i: Int): Boolean ={

    if(a % i != 0 && i < a/2) {
      aCheckPrimeFunc(a,i+1)
    }
    else {
      !(a % i == 0)
    }

  }

  println()
  println(aCheckPrimeFunc(20,2))

  def anotherPrimeFunc(n: Int): Boolean ={
    def isPrimeUntil(a: Int): Boolean ={
      if(a<=1) true
      else n % a != 0 && isPrimeUntil(a-1)
    }
    isPrimeUntil(n/2)
  }

  println(anotherPrimeFunc(20))
  println(anotherPrimeFunc(7))


}
