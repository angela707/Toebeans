package com.panini.toebeans

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform