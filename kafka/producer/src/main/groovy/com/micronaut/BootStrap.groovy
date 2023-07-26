package com.micronaut

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.context.annotation.Context
import io.micronaut.context.annotation.Property
import io.micronaut.context.event.StartupEvent
import io.micronaut.messaging.annotation.MessageBody
import io.micronaut.runtime.event.annotation.EventListener
import jakarta.inject.Inject

@Context
class BootStrap {

    @Property(name = 'kafka.bootstrap.servers')
    String kafkaServer

    @Inject
    HelloWorldClient kafkaClient

    @EventListener
    final void onStartup(StartupEvent event) {
        println 'sending message to ' + kafkaServer
        kafkaClient.send('hello-world')
        println 'finished'
    }
}

