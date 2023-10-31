package com.example.sight_seeker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform