package com.notsys

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotsysApplication

fun main(args: Array<String>) {
	runApplication<NotsysApplication>(*args)
}
