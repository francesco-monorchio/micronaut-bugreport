package com.micronaut

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties('super')
class SuperConfig {
    String name
    SubConfig sub
}

