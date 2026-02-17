package ru.lomovskiy.lifecycle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform