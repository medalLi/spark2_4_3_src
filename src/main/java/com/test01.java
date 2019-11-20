package main.java.com;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class test01 {
    public static void main(String[] args) {
        SparkConf conf =  new SparkConf().setAppName(test01.class.getSimpleName());
//            conf.setMaster("local[2]");
        JavaSparkContext sc = new JavaSparkContext(conf);
    }
}
