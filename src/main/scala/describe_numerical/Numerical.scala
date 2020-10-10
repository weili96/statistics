package describe_numerical

object Numerical {

  // 平均数
  def mean(nums:Iterable[Int]) = {
    val len = nums.size

    val sum = nums.sum

    sum / len.toDouble

  }

  // 加权平均数
  def weightedMean(nums_weight_map:Map[Int,Int]) = {



  }

  def main(args: Array[String]): Unit = {

    val arr = List(1,2,3,4,5,6)

    println( mean(arr) )


  }

}
