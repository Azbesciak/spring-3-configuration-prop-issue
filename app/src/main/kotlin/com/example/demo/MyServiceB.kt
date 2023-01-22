package com.example.demo

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@ConditionalOnProperty("my-service", havingValue = "b")
@RequestMapping("my-service")
@RestController
class MyServiceB {
    init {
        println("SERVICE B")
    }

    @GetMapping
    fun getIt() = Mono.just("b")
}
