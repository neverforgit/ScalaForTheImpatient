


////
// P 1
////

val gadgets = Map("Pixel 2 XL" -> 1000, "Titan GPU" -> 1500)
val dicounted = for ((k, v) <- gadgets) yield (k, 0.9*v)


////
// P 2
////
val in = new java.util.Scanner(new java.io.File("./data/kjvdat.txt"))
val counts2 = scala.collection.mutable.Map[String, Int]().withDefaultValue(0)
while (in.hasNext()) {
	val tempWord = in.next()
	counts2(tempWord) = counts(tempWord) + 1
}

////
// P 3
////

val in = new java.util.Scanner(new java.io.File("./data/kjvdat.txt"))
var counts3 = Map[String, Int]().withDefaultValue(0)
while (in.hasNext()) {
	val tempWord = in.next()
	counts3 += (tempWord -> (counts2(tempWord)+1))
}


////
// P 4
////
val in = new java.util.Scanner(new java.io.File("./data/kjvdat.txt"))
val counts4 = scala.collection.mutable.SortedMap[String, Int]()
while (in.hasNext()){
	val tempWord = in.next()
	counts4(tempWord) = counts4.getOrElse(tempWord, 0) + 1
}


////
// P 5
////
import scala.collection.JavaConverters._

import java.util.TreeMap

val in = new java.util.Scanner(new java.io.File("./data/kjvdat.txt"))
val counts5 = new java.util.TreeMap[String, Int].asScala
while (in.hasNext()){
	val tempWord = in.next()
	counts5(tempWord) = counts5.getOrElse(tempWord, 0) + 1
}


////
// P 7
////
val props = java.lang.System.getProperties.asScala
// length of longest key
var longest = 0
for(k <- props.keySet if k.length > longest) longest = k.length
// print w/ an additional 5 spaces padding for even the longest keySet
for ((k,v) <- props) println(k + " "*(longest - k.length+5) + "|" + v)














