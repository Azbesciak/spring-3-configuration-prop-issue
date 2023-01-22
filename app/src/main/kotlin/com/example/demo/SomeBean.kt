package com.example.demo

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@ConfigurationProperties("my-service")
@ConditionalOnProperty("my-service", havingValue = "c")
@Component
data class SomeBean(var customValue: String = "not set", var myProps: List<SomeProp> = emptyList())

data class SomeProp(
    var name: String = "",
    var values: Set<SomeEnum> = emptySet(),
)
