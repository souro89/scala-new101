package lectures.partbasics

import scala.annotation.tailrec

object Recursions extends App {

  def factorial(n: Int): Int = {
    if(n==1) 1
    else n * factorial(n-1)
  }

  println(factorial(10))

  // Recursion takes up Stack Memory

  def anotherRecursiveFunc(n: Int): BigInt = {
    @tailrec
    def factorialHelpler(a: Int, accumulator: BigInt): BigInt = {
      if(a<=1) accumulator
      else factorialHelpler(a-1, a * accumulator) // TAIL RECURSION = use recursive call as the last expression
    }

    factorialHelpler(n, 1)
  }

  println(anotherRecursiveFunc(5000))

  //When loops are needed use tail recursion

  // Concatenate a String n times

  def aStringConcatenator(a: String, n: Int): String = {
    @tailrec
    def concatHelper(n: Int, accumulator: String): String = {
      if(n==1) accumulator
      else concatHelper(n-1,a+" "+accumulator)
    }
    concatHelper(n,a)
  }

  println(aStringConcatenator("Hello",5))

  // IsPrime Tail Recursion
  def aIsPrime(a: Int): Boolean = {
    @tailrec
    def primeHelper(x: Int): Boolean = {
      if(x > a/2) true
      else {
        if( a % x == 0) false
        else primeHelper(x+1)
      }
    }
    primeHelper(2)
  }

  println(aIsPrime(7))

  // Fibonacci function tail recursion

  def atailrecursionfibonacci(a: Int): Int = {
    @tailrec
    def fiboHelper(x: Int , y: Int, n: Int): Int = {
      if(n==1) x
      else {
//        println(x)
        fiboHelper(y, x+y, n-1)
      }
    }
    fiboHelper(1, 1, 8)
  }

  println(atailrecursionfibonacci(8))

  def anotherPrimeTailRecWay(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(a: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(a<=1) true
      else isPrimeHelper(a-1, n % a != 0 && isStillPrime)
    }

    isPrimeHelper(n/2, true)
  }

  println(anotherPrimeTailRecWay(7))


}
