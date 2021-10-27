package edu.knoldus

object Run  {
  def main(args: Array[String]): Unit = {
    val obj = new SolutionTwo
    print(obj.xs.sumOfList(List()))
    val obj2 = new SolutionOne
    print(obj2.addition.add(9, 3))
    val obj3 = new SolutionThree
    print(obj3.hof.higherOrderFunction(obj3.func, 11))
  }
}