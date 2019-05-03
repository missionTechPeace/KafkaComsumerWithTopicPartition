package com.kafka.listner;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;

@Slf4j
public class Listener {

    @KafkaListener(id = "1d0" ,groupId = "group4" , topicPartitions = {@TopicPartition(topic = "user_json_test" , partitions = {"0"})} ,
            containerFactory= "kafkaListenerContainerFactory")
    public void simpleListner1(ConsumerRecord<?, ?> record) {
        log.info("message received from listener 1 " +  record);
    }
    @KafkaListener(id = "1d1" ,groupId = "group4" , topicPartitions = {@TopicPartition(topic = "user_json_test" , partitions = {"1"})},
            containerFactory= "kafkaListenerContainerFactory")
    public void simpleListner2(ConsumerRecord<?, ?> record) {
        log.info("message received from listener 2 " +  record);
    }
    @KafkaListener(id = "1d2" , groupId = "group4" , topicPartitions = {@TopicPartition(topic = "user_json_test" , partitions = {"2"})} ,
            containerFactory= "kafkaListenerContainerFactory")
    public void simpleListner3(ConsumerRecord<?, ?> record) {
        log.info("message received from listener 3 " +  record);
    }
}
