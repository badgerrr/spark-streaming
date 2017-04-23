def evens(num:Int): Boolean = {
  num%2== 0
}

evens(5)
evens(6)

def isEvenList(numlist:List[Int]): Boolean = {
  for(x <- numlist){
    if (x%2==0){
      return true
    }
  }
return false
}

val oddList = List(1,3,5,7)
val evenList = List(1,2,3,4)

isEvenList(oddList)
isEvenList(evenList)


def luckySeven(luckylist:List[Int]): Int ={
  luckylist.map(x => if(x == 7) x*2 else x).sum
}

val notLucky = List(1,2,3,4,5,6)
val isLucky  = List(1,2,3,4,5,6,7)

luckySeven(notLucky)
luckySeven(isLucky)


def isEvenSplit(splitList:List[Int]): Boolean = {
  val listLength = splitList.length

  def splitListAt(splitPoint:Int): Boolean = {
    val (listA, listB) = splitList.splitAt(splitPoint)
    listA == listB
  }

Range(1,listLength).map(x => splitListAt(x))
}

val canSplit = List(1,2,3)
val cannotSplit = List(1,2,3,4)

isEvenSplit(canSplit)
isEvenSplit(cannotSplit)
