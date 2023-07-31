package com.micronaut

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class ConfigInjectionSpec extends Specification {

    @Inject
    SuperConfig superConfig

    void 'super and sub should be as expected'() {
        expect:
        superConfig.name == 'super'
        superConfig.sub.name == 'sub'
    }
}
