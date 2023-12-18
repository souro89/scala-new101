package lectures.partbasics

object Expressions extends App{

  val x = 1 + 2 // Expressions
  println(x)

  println(1 == x)

   //Instructions (Do) and Expressions (VALUE)

   val aCondition = true
   val aConditionedValue = if(aCondition) 5 else 3
   println(aConditionedValue)

   // IN non fucntional languages we would use if as an instruction were as in scala
   // if returns a value hence is an expression

   var aVariable = 3

   val aWeirdValue = (aVariable = 3) // Unit == void
   println(aWeirdValue)

   // Unit === () ... if printed to console

   val aCodeBlock = {
     val y = 2
     val z = y + 1

     if (z > 2) "hello" else "goodbye"
   }

}
