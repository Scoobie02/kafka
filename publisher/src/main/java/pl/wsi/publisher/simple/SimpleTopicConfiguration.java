package pl.wsi.publisher.simple;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SimpleTopicConfiguration {
	public static final String SIMPLE_TOPIC = "simple";

	@Bean
	NewTopic simpleTopic() {
		return new NewTopic(SIMPLE_TOPIC, 1, (short) 1);
	}

}
