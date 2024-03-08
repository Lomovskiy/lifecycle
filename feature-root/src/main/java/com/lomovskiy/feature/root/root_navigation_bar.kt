package com.lomovskiy.feature.root

import android.graphics.drawable.Icon
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RootNavigationBar() {
    NavigationBar {
        repeat(RootNavigationItem.entries.size) {
            NavigationBarItem(
                selected = true,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_fitness_center_24),
                        contentDescription = null
                    )
                }
            )
        }
    }
}

@Preview
@Composable
fun RootNavigationBarPreview() {
    RootNavigationBar()
}