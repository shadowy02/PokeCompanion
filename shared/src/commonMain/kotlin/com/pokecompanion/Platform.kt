package com.pokecompanion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform