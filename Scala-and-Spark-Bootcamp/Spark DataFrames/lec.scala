import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()
val df = spark.read.option("header","true").option("inferSchema","true").csv("ContainsNull.csv")

df.show()
val avrg = df.select(avg("Sales"))


val df2 = df.na.fill(avrg,Array("Sales"))

df2.na.fill("Unknown",Array("Name")).show()
