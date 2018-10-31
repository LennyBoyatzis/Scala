package com.cookbook

object Strings extends App {
  val s = "Hello, world!"
  println("String length", s.length)

  val s2 = "Hello" + "World"
  "hello".foreach(println)

  // treat string as sequence of chars
  for (c <- "dog") println(c)

  // treat string as sequence of bytes
  s.getBytes.foreach(println)

  // use methods like filter
  val result = "hello world".filter(_ != '1')
  println("result", result)

  // Through use of implicit conversions
  // Scala is able to add methods to the java String class
  val funcitown = "Sup homie"
    .drop(2)
    .take(2)
    .capitalize

  // drop - discards first two chars from string
  // take - takes the next two

  // COMPARING STRINGS
  val s3 = "Hello"
  val s4 = "Hello"
  println("s3 == s4", s3 == s4)

  // EqualsIgnoreCase
  val a = "Marisa"
  val b =" marisa"
  println("Do they equal", a.equalsIgnoreCase(b))

  // Don't have to check for null values when comparing strings
  // Multiline Strings
  val foo =
    """This is a
      |multiline
      |String""".stripMargin

  // Convert multiline to continuous
  val speech =
    """Four score and
      |"seven years" ago
      |our 'fathers'
    """.stripMargin.replaceAll("\n", " ")


}
