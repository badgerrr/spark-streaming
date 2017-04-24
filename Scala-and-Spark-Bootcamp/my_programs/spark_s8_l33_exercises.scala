def isEven(num:Int): Boolean = {
  num%2==0
}

def evenList(numlist:List[Int]): Boolean = {
  numlist.exists(x => x%2==0)
}

val myList = List(1,2,3,4,5) //true
val myOddList = List(1,3,5,7) //false

evenList(myList)
evenList(myOddList)

def luckySeven(luckylist:List[Int]): Int = {
  luckylist.map(x => if(x==7) 14 else x).sum
}

val nosevens = List(1,2,3,4,5,6) //21
val sevens = List(1,2,3,4,5,6,7,7) //49

luckySeven(nosevens)
luckySeven(sevens)

//sum left, sum right, are they equal?

def equalSplit(balance:List[Int]): Boolean = {
  def isBalancedAt(pos: Int): Boolean = {
    val (left, right) = balance.splitAt(pos)
    left.sum == right.sum
  }

  val listlength = balance.length

  (1 until listlength).exists(x=>isBalancedAt(x))
  Range(1,listlength).exists(isBalancedAt)
}

val hasSplit = List(1,2,3)
val noSplit = List(1,2,3,4)

equalSplit(hasSplit)
equalSplit(noSplit)
