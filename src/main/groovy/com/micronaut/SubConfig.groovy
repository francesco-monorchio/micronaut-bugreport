package com.micronaut

import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.core.annotation.Introspected

@ConfigurationProperties('sub')
class SubConfig {

    String name

}