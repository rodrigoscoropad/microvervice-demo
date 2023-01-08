package com.rfsenterprise.twittertokafkaworker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TwitterToKafkaWorkerApplication

fun main(args: Array<String>) {
	runApplication<TwitterToKafkaWorkerApplication>(*args)
}
