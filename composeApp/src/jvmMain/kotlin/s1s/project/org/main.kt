package s1s.project.org

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "TeamsConnect",
    ) {
        App()
    }
}