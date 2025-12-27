package com.aradsheybak.muli_threading

sealed class Screen(val route: String) {
    object main : Screen("main")
    object threading : Screen("threading")
    object coroutine : Screen("coroutine")
    object flow : Screen("flow")

}