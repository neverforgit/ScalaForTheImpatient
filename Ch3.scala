import scala.util.Random.nextInt


//// 
// P 1
////
def randIntArray(n: Int) =  for (i <- 1 to n) yield nextInt(n)

////
// P 2
////
def swapMembers(a: Array[Int]) = {
	val out = new Array[Int](a.size)
	a.copyToArray(out)  // ensures we pickup last item in odd length array
	for (i <- 0 until a.size-1 by 2) {
		out(i) = a(i+1)
		out(i+1) = a(i)
	}
	out
}

////
// P 3
////

def swapMembersV2(inputArr: Array[Int]) = {
	val idxs = inputArr.indices.toArray[Int]
	if (inputArr.size % 2 == 0) {
		for(i <- inputArr.indices)  {if (i%2==0) idxs(i)=inputArr.indices(i+1) else idxs(i)=inputArr.indices(i-1)}
	} else {
		for(i <- 0 until inputArr.size-1)  {if (i%2==0) idxs(i)=inputArr.indices(i+1) else idxs(i)=inputArr.indices(i-1)}
	}
	for (i <- idxs) yield inputArr(i)
}

////
// P 4
////

def intSorter(a: Array[Int]) = {
	val posIdxs = (for(i <- a.indices if a(i) > 0) yield i).toArray
	val negIdxs = (for(i <- a.indices if a(i) <= 0) yield i).toArray
	val all = posIdxs ++ negIdxs
	for (i <- all) yield a(i)
}

////
// P 5
////

def arrayMean(inArr: Array[Double]) = inArr.sum / inArr.size





