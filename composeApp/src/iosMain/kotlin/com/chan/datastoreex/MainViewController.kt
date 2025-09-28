package com.chan.datastoreex

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    App(
        prefs = remember {
            createDataStore()
        }
    )
}