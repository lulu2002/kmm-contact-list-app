package com.plcoding.contactscomposemultiplatform.core.presentation

import androidx.compose.ui.window.ComposeUIViewController
import com.plcoding.contactscomposemultiplatform.App
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = ComposeUIViewController {
    App(
        darkTheme = isDarkTheme(),
        dynamicColor = false
    )
}


private fun isDarkTheme(): Boolean {
    return UIScreen.mainScreen.traitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark
}