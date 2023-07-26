package com.micronaut

import io.micronaut.context.ApplicationContextBuilder
import io.micronaut.context.ApplicationContextConfigurer
import io.micronaut.context.annotation.ContextConfigurer
import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {
    @ContextConfigurer
    static class Configurer implements ApplicationContextConfigurer {

        @Override
        void configure(ApplicationContextBuilder builder) {

            def environments = [
                    'dev'
            ] as String[]
            builder.banner(false)
                    .deduceEnvironment(false)
                    .defaultEnvironments(environments)
                    .eagerInitConfiguration(true)
        }

    }

    static void main(String[] args) {
        Micronaut.run(args)
    }
}
