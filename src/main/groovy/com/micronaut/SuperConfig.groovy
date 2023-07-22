package com.micronaut

import io.micronaut.context.annotation.ConfigurationProperties
import jakarta.inject.Inject

@ConfigurationProperties('super')
class SuperConfig {

    @Inject
    SubConfig sub

    String name

}

