import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()
val df = spark.read.option("header","true").option("inferSchema","true").csv("ContainsNullcsv")


df.printSchema()
df.show()
