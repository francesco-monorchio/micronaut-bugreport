package com.micronaut

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class MicronautBugreportSpec extends Specification {

    @Inject
    EmbeddedApplication<? extends EmbeddedApplication> application

    void 'test it works'() {
        expect:
        application.running
    }
}
