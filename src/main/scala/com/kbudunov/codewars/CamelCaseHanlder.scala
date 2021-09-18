package com.kbudunov.codewars

object CamelCaseHanlder extends App {

  val str = "the-Stealth_Warrior"

  val result = str
    .replaceAll("-", "_")
    .split("_").zipWithIndex.map{ e =>
    if(e._2 == 0) {
      e._1
    } else {
      e._1.capitalize
    }
  }.mkString

  //the best one
  def toCamelCase(str: String): String = str.split("[_-]").reduce((a, b) => a + b.capitalize)

  println(result)

}
