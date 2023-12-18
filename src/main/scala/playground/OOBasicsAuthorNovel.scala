package playground

class Writer(val firstName: String,val lastName: String,val age: Int){

  def fullname(): Unit = {
    println(s"${this.firstName} ${this.lastName}")
  }
}

class Novel(name: String,yearOfRelease: Int, author: Writer){
  val authorAge = author.age
  val isWrittenBy = s"${author.firstName} ${author.lastName}"

  def newRelease(year: Int): Novel = {
    new Novel(this.name,year,this.author)
  }
  
}


object OOBasicsPrac extends App{

  val writer = new Writer("John","Doe", 26)
  writer.fullname()

}


