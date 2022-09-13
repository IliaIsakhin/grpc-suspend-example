package ilia.isakhin.grpcsuspend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcSuspendApplication

fun main(args: Array<String>) {
	runApplication<GrpcSuspendApplication>(*args)
}
