package org.deer.test;

import old.kafka.producer.ProducerData;
import org.apache.kafka.clients.producer.ProducerRecord;

public class TwoKafkaDriversExample {

    public static void main(String[] args) {
        new ProducerData("String", null);
        new ProducerRecord("String", null);
    }
}
