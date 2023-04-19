package kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver2 {

    @KafkaListener(topics = {"topicA"}, groupId = "gid2")
    public void recieve(@Payload String message) {
        System.out.println("Reciever recieved message " + message);
    }

    @KafkaListener(topics = {"topicA2"})
    public void secondMessage(@Payload String message) {
        System.out.println("Reciever recieved message " + message);
    }

}
