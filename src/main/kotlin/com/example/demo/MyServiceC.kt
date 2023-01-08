package com.example.demo

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@ConditionalOnBean(SomeBean::class)
@RequestMapping("my-service")
@RestController
class MyServiceC(val someBean: SomeBean) {
    init {
        println("SERVICE C: ${someBean.customValue}")
    }
    @GetMapping
    fun getIt() = Mono.just(someBean.customValue)
}
