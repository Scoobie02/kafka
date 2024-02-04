package pl.wsi.consumer.simple;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static pl.wsi.consumer.simple.SimpleTopicConsumerConfig.SIMPLE_TOPIC;

@Slf4j
@Component
class SimpleTopicConsumer {
	@KafkaListener(topics = SIMPLE_TOPIC, groupId = SIMPLE_TOPIC)
	public void receive(ConsumerRecord<String, String> consumerRecord) {
		log.info("Received payload: '{}'", consumerRecord.toString());
	}
}
