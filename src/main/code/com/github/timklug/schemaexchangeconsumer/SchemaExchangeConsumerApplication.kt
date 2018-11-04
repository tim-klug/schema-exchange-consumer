package com.github.timklug.schemaexchangeconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchemaExchangeConsumerApplication

fun main(args: Array<String>) {
  runApplication<SchemaExchangeConsumerApplication>(*args)
}
