package com.chan.datastoreex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform