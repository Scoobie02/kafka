package pl.wsi.publisher.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topic/simple")
@RequiredArgsConstructor
class SimpleTopicController {

	private final SimpleTopicMessageProducer simpleTopicMessageProducer;

	@GetMapping("/{message}")
	public void publishMessage(@PathVariable("message") String message) {
		simpleTopicMessageProducer.sendMessage(message);
	}
}
