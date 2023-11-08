package com.example.readarticleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.CombinedModifier
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.readarticleapp.ui.theme.ReadArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReadArticleAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopImage("Laura")
                }
            }
        }
    }
}

@Composable
fun TopImage(message: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box{ Image(painter = image, contentDescription =null ) }
    Column {
        Text1(message, modifier)
        Text2(message = message, modifier = modifier)
        Text3(message = message, modifier = modifier)
    }
}

@Composable
fun Text1(message: String, modifier: Modifier) {
    Text(text = "Jetpack Compose tutorial", fontSize = 24.sp)
    modifier.padding(16.dp)
    TextAlign.Justify
}

@Composable
fun Text2(message: String, modifier: Modifier) {
    Text(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.")
    modifier.padding(start = 16.dp, end = 16.dp)
    TextAlign.Justify
}

@Composable
fun Text3(message: String, modifier: Modifier) {
    Text(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    modifier.padding(16.dp)
    TextAlign.Justify
}

