package com.aradsheybak.threading.basics

import android.util.Log

class SimpleThreadExample {
    companion object {
        private const val TAG = "SimpleThreadExample"

        fun demonstrateBasicThread() {
            Log.d(TAG, "we are in thread: ${Thread.currentThread().name}")

            val backgroundThread = Thread {
                // this code run on new Thread

                // new Thread
                Log.d(TAG, "new Thread: ${Thread.currentThread().name}")

                //counting 1 to 5 and delay between each count for 1 sec

                for (i in 1..5) {
                    Log.d(TAG, "number=  $i in thread: ${Thread.currentThread().name}")

                    try {
                        Thread.sleep(1000)

                    } catch (e: InterruptedException) {
                        Log.e(TAG, "Thread broken!", e)
                    }
                }
                Log.d(TAG, "counting in thread ${Thread.currentThread().name} finished!")

            }

            // start new Thread
            backgroundThread.start()
            Log.d(TAG, "Thread started!")
        }
    }
}

