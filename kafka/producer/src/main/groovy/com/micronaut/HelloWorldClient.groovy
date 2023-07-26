package com.micronaut

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.messaging.annotation.MessageBody

@KafkaClient
interface HelloWorldClient {

    @Topic('hello')
    void send(@MessageBody String message)

}