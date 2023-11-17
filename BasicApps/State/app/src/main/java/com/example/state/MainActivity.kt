package com.example.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.state.ui.theme.StateTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateTheme {
                Column(Modifier
                    .fillMaxSize()) {
                    val color = remember {
                        mutableStateOf(Color.Yellow) //remember is not always resetting value to yellow,
                    }
                    ColorBox(Modifier.weight(1f) .fillMaxSize()){
                        color.value = it//set colour.value to its new colour random
                    }
                    Box(modifier = Modifier
                        .background(color.value)
                        .weight(1f)//both will get same space in column
                        .fillMaxSize())
                }
            }
        }
    }
}

//change the state of the parent composable
@Composable
fun ColorBox(modifier: Modifier = Modifier,
             updateColour:(Color) -> Unit) { //it will take the updated (Colour)colour

    Box(modifier = modifier //modifier is being passed down
        .background(Color.Red)
        .clickable { //when we click box we call lamda function with the new colour value
            updateColour(Color(
                Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f //the default
            ))
        })
}

//hey the state change and recompose it