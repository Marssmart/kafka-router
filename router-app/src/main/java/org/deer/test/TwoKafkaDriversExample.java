package org.deer.test;

import old.kafka.producer.ProducerData;
import org.apache.kafka.clients.producer.ProducerRecord;

public class TwoKafkaDriversExample {

    public static void main(String[] args) {
        new ProducerData("String", null);//old kafka class
        new ProducerRecord("String", null);//new kafka class
    }
}
