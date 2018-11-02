package com.aimer.flink.demo

import org.apache.flink.api.scala._
import org.apache.flink.table.api.TableEnvironment
import org.apache.flink.table.api.scala._

/**
  * References:
  * https://github.com/apache/flink/blob/master/flink-examples/flink-examples-table/src/main/scala/org/apache/flink/table/examples/scala/WordCountSQL.scala
  **/

object WordCountSQL {

  case class WC(word:String, frequency:Long)

  def main(args:Array[String]) = {

    // set up execution environment
    val env = ExecutionEnvironment.getExecutionEnvironment
    val tEnv = TableEnvironment.getTableEnvironment(env)

    val input = env.fromElements(WC("Aimer", 1), WC("Aimer", 1), WC("Kokia", 1), WC("inuyasha",1), WC("Taka", 1))

    // register the DataSet as table "WordCount"
    tEnv.registerDataSet("WordCount", input, 'word, 'frequency)

    // run a SQL query on the Table and retrieve the result as a new Table
    val table = tEnv.sqlQuery("SELECT word, SUM(frequency) FROM WordCount GROUP BY word")

    table.toDataSet[WC].print 
  }
}
