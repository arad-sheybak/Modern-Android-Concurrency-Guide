package com.aradsheybak.threading.executer

import java.util.concurrent.Executors

fun runExecutorExample(onLog: (String) -> Unit) {

    fun log(message: String) {
        onLog("$message | Thread: ${Thread.currentThread().name}")
    }

    val executor = Executors.newFixedThreadPool(3)

    for (i in 1..20) {
        executor.execute {
            log("Task $i started")
            Thread.sleep(500)
            log("Task $i finished")
        }
    }

    executor.shutdown()
}
