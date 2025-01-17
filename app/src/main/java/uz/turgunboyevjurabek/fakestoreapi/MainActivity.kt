package uz.turgunboyevjurabek.fakestoreapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.fakestoreapi.feature.presentation.navigation.MyNavigation
import uz.turgunboyevjurabek.fakestoreapi.feature.presentation.screens.MainScreen
import uz.turgunboyevjurabek.fakestoreapi.ui.theme.FakeStoreApiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FakeStoreApiTheme {
                val navHostController = rememberNavController()
                MyNavigation(navController = navHostController)
            }
        }
    }
}
