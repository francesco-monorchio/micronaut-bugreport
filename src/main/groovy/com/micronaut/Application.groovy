package com.micronaut

import groovy.transform.CompileStatic
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.Micronaut
import io.micronaut.runtime.event.annotation.EventListener
import jakarta.inject.Inject

@CompileStatic
class Application {

    @Inject
    SuperConfig superConfig

    @EventListener
    final void onStartup(StartupEvent event) {
        println superConfig.sub.name == 'sub'
    }

    static void main(String[] args) {
        Micronaut.run(Application, args)
    }
}
