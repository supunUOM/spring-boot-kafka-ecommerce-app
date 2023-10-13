package net.javaguides.emailservice.kafka;

import lombok.extern.slf4j.Slf4j;
import net.javaguides.basedomains.dto.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailConsumer {

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumer(OrderEvent orderEvent) {
        log.info(String.format("Order event received in email service -> %s", orderEvent.toString()));

        //send email to customer
    }
}
