package dev.fordewe.clinicapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform