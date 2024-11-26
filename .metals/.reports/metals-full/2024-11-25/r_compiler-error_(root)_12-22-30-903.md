file://<WORKSPACE>/site/src/main/scala/syntax.scala
### scala.MatchError: TypeDef(N,Ident(Int)) (of class dotty.tools.dotc.ast.Trees$TypeDef)

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1064
uri: file://<WORKSPACE>/site/src/main/scala/syntax.scala
text:
```scala
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

def function:Unit = {
    println("I'm a function") // like in python
}

lazy val mix = {
    println("I'm a lazy val")
    // function on first call, then only the bind
    42
}

// infix notation *, +, - etc
// use backquotes to give weird names to variables or functions like `3 - somthing` as function name

// Types 

//val nothing:Nothing = throw new Exception("I'm nothing") // nothing is a subtype of every other type
val unit1:Unit = () // similar to void in java
val danger:Null = null // null is a subtype of every reference type and dangerous
val yes: Boolean = true
val byteMin: Byte = Byte.MinValue // -128 data range of type

type N = Int // type alias

v@@



@main def syntax(): Unit = {
    println(let.length)
}
```



#### Error stacktrace:

```
dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents$$anonfun$2(KeywordsCompletions.scala:218)
	scala.Option.map(Option.scala:242)
	dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents(KeywordsCompletions.scala:215)
	dotty.tools.pc.completions.KeywordsCompletions$.contribute(KeywordsCompletions.scala:44)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:134)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:93)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:154)
```
#### Short summary: 

scala.MatchError: TypeDef(N,Ident(Int)) (of class dotty.tools.dotc.ast.Trees$TypeDef)