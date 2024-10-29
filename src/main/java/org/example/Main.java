package org.example;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;



public class Main {
    public static void main(String[] args) {
        listBuckets();
    }

    public static void listBuckets (){
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withRegion("us-east-1")
                .build();

        List<Bucket> buckets = s3Client.listBuckets();

        System.out.println("Your Amazon S3 buckets are:");
        for (Bucket bucket : buckets) {
            System.out.println("* " + bucket.getName());
        }
    }

}

