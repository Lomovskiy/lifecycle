package ru.lomovskiy.lifecycle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.lomovskiy.lifecycle.ui.theme.LifecycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifecycleTheme {
                val navController = rememberNavController()
                NavHost(navController, GlobalNavDest.TRANSACTIONS.path) {
                    composable(GlobalNavDest.TRANSACTIONS.path) {
                        ScreenTransactions()
                    }
                    composable(GlobalNavDest.ACCOUNTS.path) {
                        ScreenAccounts()
                    }
                    composable(GlobalNavDest.REPORTS.path) {
                        ScreenReports()
                    }
                    composable(GlobalNavDest.SETTINGS.path) {
                        ScreenSettings()
                    }
                }
                Scaffold(
                    bottomBar = {
                        GlobalNavBar {  }
                    },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifecycleTheme {
        Greeting("Android")
    }
}