package lectures.partbasics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // Vals is immutable

  val y = 42

  println(y)

  //compiler can infer types

  val astring: String = "Helllo Scala";
  println(astring)

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = 42
  val aShort: Short = 4613
  val aLong: Long = 12312314123123L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //Variables

  var aVariable: Int = 4

  aVariable = 5

  //Variables are mutable and are known as side effects , they can be changed

}
