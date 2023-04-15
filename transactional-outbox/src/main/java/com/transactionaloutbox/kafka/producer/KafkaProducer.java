package com.transactionaloutbox.kafka.producer;

import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.io.Serializable;

public interface KafkaProducer<K extends Serializable, V> {
  void send(String topicName, K key, V message, ListenableFutureCallback<SendResult<K, V>> callback);
}
