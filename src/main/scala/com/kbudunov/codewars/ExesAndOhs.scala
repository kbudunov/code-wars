package com.kbudunov.codewars

object ExesAndOhs extends App {

  //my first one
  def xo(str: String): Boolean = {
      str.toLowerCase.toList
        .filter("ox".toList.contains)
        .groupBy(identity)
        .map{case (k, v) => (k, v.size)}
        .values.foldLeft(0)((a, b) => b - a)
        .equals(0)
  }

  //my second one
  private val tuple = "xxxxxoooXooo".toLowerCase.toList.filter("ox".toList.contains).partition(_ == 'o')
  val res = tuple._1.size == tuple._2.size


  //my improved one
  private val tuple1 = "xxxxxoooXooo".toLowerCase.filter("ox".contains(_)).partition(_ == 'o')
  tuple1._1.length == tuple._2.length

  //the best one
  def xo1(str: String): Boolean =
    str.count(_.toLower == 'x') == str.count(_.toLower == 'o')

  println(res)

}
