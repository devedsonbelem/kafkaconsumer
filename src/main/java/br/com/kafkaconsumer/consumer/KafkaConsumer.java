package br.com.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	@KafkaListener(topics = "teste2")
	public void processMessage(Object content) {
		System.out.println("Message received: "  + content.toString());
	}
}