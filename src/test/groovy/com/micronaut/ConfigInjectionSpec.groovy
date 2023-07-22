package com.micronaut

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class ConfigInjectionSpec extends Specification {

    @Inject
    SuperConfig superConfig

    @Inject
    SubConfig subConfig

    void 'test it works'() {

        expect:
        subConfig.name == 'sub'
        superConfig.name == 'super'
        superConfig.sub.name == 'sub'

    }

}
