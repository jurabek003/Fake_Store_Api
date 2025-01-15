package uz.turgunboyevjurabek.fakestoreapi.feature.presentation.screen_state

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.fakestoreapi.feature.domain.madels.MyProduct
import uz.turgunboyevjurabek.fakestoreapi.feature.presentation.components.mai_components.MySearchView
import uz.turgunboyevjurabek.fakestoreapi.feature.presentation.components.mai_components.ProductsList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainSuccessScreen(
    data: MyProduct,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Discover",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Black
                        )
                    )
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Rounded.Notifications, contentDescription = null)
                    }
                },
                modifier = modifier
            )
        },
        modifier = modifier,
    ) { innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding)
        ) {
            MySearchView()
            Text("All products",fontWeight = FontWeight.Bold,fontFamily = FontFamily.SansSerif,fontSize = 18.sp,modifier = modifier.padding(16.dp))
            ProductsList()
        }
    }

}