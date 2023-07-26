package com.micronaut

import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class ApplicationIntegrationTest extends Specification {

    @AutoCleanup
    @Inject
    @Subject
    EmbeddedServer server

    def 'Should server be up and running'() {

        expect:
        server.running
    }

}
