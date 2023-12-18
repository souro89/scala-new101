package lectures.oop

object OOBasics extends App{

  val person = new Person("John",26)
  println(person.age)
  person.greet("Daniel")

}


class Person(name: String,val age: Int)// Constructor
{

  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

}
