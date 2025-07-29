package s1s.project.org

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform