package pl.wsi.publisher.simple;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

import static pl.wsi.publisher.simple.SimpleTopicConfiguration.SIMPLE_TOPIC;

@Slf4j
@Component
@RequiredArgsConstructor
class SimpleTopicMessageProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(SIMPLE_TOPIC, message);
		future.whenComplete((result, ex) -> {
			if (ex == null) {
				log.info("Sent message=[" + message +
						"] with offset=[" + result.getRecordMetadata().offset() + "]");
			} else {
				log.info("Unable to send message=[" +
						message + "] due to : " + ex.getMessage());
			}
		});
	}
}
