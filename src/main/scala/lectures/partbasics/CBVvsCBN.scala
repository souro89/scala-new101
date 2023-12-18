package lectures.partbasics

object CBVvsCBN extends App{

  def calledByValue(t: Long): Unit={
    println("Called By Value :"+t)
    println("Called By Value :"+t)
  }


  def calledByName(t: => Long): Unit = {
    println("Called By Name :" + t)
    println("Called By Name :" + t)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  // In call by Value the value is passed after the expression is evaluated
  // In Call by  name the expression is passed and is evaluated each time in the function call hence the different results

// Output
//  Called By Value: 245432906075300
//  Called By Value: 245432906075300
//  Called By Name: 245432962932200
//  Called By Name: 245432963593500


}
