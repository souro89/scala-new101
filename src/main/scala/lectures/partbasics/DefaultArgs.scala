package lectures.partbasics

object DefaultArgs extends App{

  def trFacts(n: Int, acc: Int = 1): Int ={
      if(n <= 1) acc
      else trFacts(n-1, n*acc)
  }

  val Fact10 = trFacts(10)

}
