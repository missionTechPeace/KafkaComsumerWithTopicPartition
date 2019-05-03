# KafkaComsumerWithTopicPartition

Here I have user 3 concurent kafka Listener and assigned each lister to a single topic partitions using @TopicPartitions 
annotations.
 
Below are the steps to run the application:-

    Start zookeeper

    Start broker1,broker2,broker3
  
  Create Topic with replication factor as 3 and 3 partition as below :
  
     bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 3 --partitions 3 --config retention.ms=100000 --topic user_json_test

  Produce message to the topic as below :-
     
     bin/kafka-console-producer.sh --broker-list  localhost:9092 --topic user_json_test
