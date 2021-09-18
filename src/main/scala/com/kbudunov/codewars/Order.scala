package com.kbudunov.codewars

object Order extends App {

  //my first one
  def descendingOrder(num: Int): Int = {
    s"$num".toCharArray.map(_.asDigit).sorted(Ordering[Int].reverse).mkString.toInt
  }

  //my best one
  def descendingOrder2(num: Int): Int = {
    s"$num".toList.sorted.reverse.mkString.toInt
  }

  //the best one
  def descendingOrder3(num: Int): Int = {
    num.toString.sorted.reverse.mkString.toInt //for scala 2.12
  }

  def descendingOrder4(num: Int): Int = {
    s"$num".sortWith(_>_).toInt //for scala 2.12
  }

  println(descendingOrder2(159923))
}
