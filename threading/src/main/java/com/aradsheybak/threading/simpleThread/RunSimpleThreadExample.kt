package com.aradsheybak.threading.simpleThread

fun runSimpleThreadExample(onLog: (String) -> Unit) {

    fun log(message: String) {
        onLog("$message | Thread: ${Thread.currentThread().name}")
    }

    // 1. UI Thread
    log("UI Thread - Before starting new Thread")

    // 2. Background Thread
    Thread {
        log("Background Thread - Inside Thread")
    }.start()

    // 3. UI Thread
    log("UI Thread - After starting new Thread")
}
