package control_structures

object loopXif {
  def main(args: Array[String]): Unit ={
    for(i <- 1 to 10 if i % 2 ==0) println(i)
  }
}
