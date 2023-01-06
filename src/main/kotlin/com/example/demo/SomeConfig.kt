package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Service

data class MyConfig(
    var value: String = "is not set",
)

@Configuration
class SomeConfig {

    @Bean
    @ConfigurationProperties("my-config")
    fun myConfig() = MyConfig()
}

@Service
class SomeService(myConfig: MyConfig) {
    init {
        println("MY CONFIG value: ${myConfig.value}")
    }
}
