package ks.study.springbootkafka.controller;

import ks.study.springbootkafka.service.KafkaConsumer;
import ks.study.springbootkafka.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final KafkaProducer producer;

    @PostMapping
    public String sendMessage(@RequestParam("message") String message){
        this.producer.sendMessage(message);

        return "ok";
    }
}
