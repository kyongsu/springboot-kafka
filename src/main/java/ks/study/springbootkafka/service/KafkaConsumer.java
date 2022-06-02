package ks.study.springbootkafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-demo", groupId = "kafka-demo")
    public void cousume(String message){
        log.info("Consumed message : {}", message);
    }
}
