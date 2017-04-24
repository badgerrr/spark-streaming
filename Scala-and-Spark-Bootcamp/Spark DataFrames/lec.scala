// Dates and TimeStamps

// Start a simple Spark Session
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

// Create a DataFrame from Spark Session read csv
// Technically known as class Dataset
val df = spark.read.option("header","true").option("inferSchema","true").csv("CitiGroup2006_2008")

// Show Schema
//df.select(month(df("Date"))).show()
val df2 = df.withColumn("Year",year(df("Date")))

val dfavgs = df2.groupBy("Year").mean()

dfavgs.select($"Year",$"avg(Close)").orderBy($"Year").show()

val dfmax = df2.groupBy("Year").max()
val dfmin = df2.groupBy("Year").min()

dfmax.select($"Year",$"max(Close)").orderBy($"Year").show()
dfmin.select($"Year",$"min(Close)").orderBy($"Year").show()
