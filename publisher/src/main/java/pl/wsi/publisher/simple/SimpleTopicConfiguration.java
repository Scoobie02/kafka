package pl.wsi.publisher.simple;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class SimpleTopicConfiguration {
	public static final String SIMPLE_TOPIC = "simple";

	@Bean
	NewTopic simpleTopic() {
		return TopicBuilder.name(SIMPLE_TOPIC)
				.partitions(1)
				.replicas(1)
				.build();
	}

}
