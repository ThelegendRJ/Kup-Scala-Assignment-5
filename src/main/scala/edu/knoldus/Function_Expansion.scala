package edu.knoldus
  //Expanding Function => val add: (Int, Int) => Int = (x: Int, y: Int) => x + y

  trait ProblemOne[-A, +B] {
    def add(x: Int,y:Int):Int
  }
  class SolutionOne {
    val addition: ProblemOne[Int, Int] = new ProblemOne[Int,Int] {
      def add(x: Int, y:Int): Int={
        val temp=x+y
        temp
      }
    }
  }

  // Expanding Function val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum

  trait ProblemTwo[list]{
    def sumOfList(list: List[Int]):Int
  }
  class SolutionTwo {
    val xs: ProblemTwo[List[Int]] = new ProblemTwo[List[Int]] {
      def sumOfList(list: List[Int]): Int = {
        val temp = List(5,7)
        val result = temp.sum
        result
      }
    }
  }

  //Expanding Function al higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)

  trait ProblemThree {
    def higherOrderFunction(f: (Int => Int), num : Int):Int
  }
  class SolutionThree {
    def func(i:Int):Int=i
    val hof: ProblemThree = new ProblemThree {
      def higherOrderFunction(f: Int => Int, num: Int): Int = f(num)
    }
  }

