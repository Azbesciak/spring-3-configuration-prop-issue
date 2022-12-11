package com.example.demo

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@ConditionalOnProperty("my-service", havingValue = "a")
@RequestMapping("my-service")
@RestController
class MyServiceA {
    init {
        println("SERVICE A")
    }
    @GetMapping
    fun getIt() = Mono.just("a")
}
