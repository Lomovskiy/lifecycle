package ru.lomovskiy.lifecycle

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GlobalNavBar(
    onClick: (GlobalNavDest) -> Unit
) {
    NavigationBar {
        GlobalNavDest.entries.forEach { dest: GlobalNavDest ->
            NavigationBarItem(
                selected = true,
                icon = { Icon(painterResource(dest.iconResId), "") },
                onClick = { onClick(dest) }
            )
        }
    }
}

@Preview
@Composable
fun GlobalNavBarPreview() {
    GlobalNavBar({})
}
