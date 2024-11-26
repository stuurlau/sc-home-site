/**
  * Syntax rules in Scala: notes
  */

// Scala expressions :
// val, var, def, lazy, type 

val const = 1337 // val similar to const in javascript
val csont2 = {
    //first time this is called it will print the line, second time only the bind the number
    println("I'm going to bind a const to 2000")
    2000
}

var let = "anything" // var similar to let in javascript aka is mutable
// characters are single quotes
// strings are double quotes

def function:Unit = {
    println("I'm a function") // like in python
}

lazy val mix = {
    println("I'm a lazy val")
    // function on first call, then only the bind
    42
}

val array = Array(1, 2, 3) // array
val firstell  =  array(0) //


// infix notation *, +, - etc
// use backquotes to give weird names to variables or functions like `3 - somthing` as function name

// Types 

//val nothing:Nothing = throw new Exception("I'm nothing") // nothing is a subtype of every other type
val unit1:Unit = () // similar to void in java
val danger:Null = null // null is a subtype of every reference type and dangerous
val yes: Boolean = true
val byteMin: Byte = Byte.MinValue // -128 data range of type

type N = Int // type alias

val a1 = 0xff // hexadecimal

val tolong = 42L // long for big numbers or D for double and F for float



@main def syntax(): Unit = {
    println(let.length)

    var fruits = Array("apple", "banana", "orange")

    fruits.mapInPlace(_.toUpperCase) // mapInPlace is a function that takes a function as an argument
    fruits.foreach(println) // foreach is a function that takes a function as an argument

    import scala.collection.mutable

    val bla = mutable.ArrayBuffer(1, 2, 3)
    // seq,set, map
    // maps is kindof python dictionary
    var mymap = Map("a" -> 1, "b" -> 2)
    // set is same as in python
    // seq is a sequence of elements

    val intersting = 
        for(i <- 1 to 10)
            yield(i)
    
    intersting.map(println(_))

    // currying 
    def plus(a:Int):Int => Int = b => a + b

    val plus2 = plus(a = 2)
    println(plus2(3))

    val reducedList = List(1,2,3,4).foldLeft(0)(_ + _)
    println(reducedList)

    class Calculator(a:Int){
        println("body of the class is executed during construction") 

        def add(b:Int):Int = a + b
    }

}