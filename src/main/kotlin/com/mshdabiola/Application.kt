package com.mshdabiola

import com.mshdabiola.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureMonitoring()
    configureTemplating()
    configureSerialization()
    configureDatabases()
    configureRouting()
}
