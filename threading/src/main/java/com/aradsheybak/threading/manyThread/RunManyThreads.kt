package com.aradsheybak.threading.manyThread

fun runManyThreads(onLog: (String) -> Unit) {

    fun log(message: String) {
        onLog("$message | Thread: ${Thread.currentThread().name}")
    }

    for (i in 1..20) {
        Thread {
            log("Thread $i started")
            try {
                Thread.sleep(500) // simulate work
            } catch (e: InterruptedException) {
                log("Thread $i interrupted")
            }
            log("Thread $i finished")
        }.start()
    }
}
