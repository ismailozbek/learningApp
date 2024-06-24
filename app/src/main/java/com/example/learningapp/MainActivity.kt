package com.example.learningapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningapp.ui.theme.LearningAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningAppTheme {

                    MainMenuApp(modifier = Modifier)

            }
        }
    }
}

@Composable
fun MainMenuApp(modifier: Modifier = Modifier) {

    Box(modifier = Modifier.fillMaxSize()) {


        Row(
            modifier = Modifier.fillMaxSize()
                .padding(top = 60.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Image(painter = painterResource(id = R.drawable.abc),contentDescription = "123")
            Image(painter = painterResource(id = R.drawable.numbers),contentDescription = "123")
            Image(painter = painterResource(id = R.drawable.colors),contentDescription = "123")
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearningAppTheme {
        MainMenuApp(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart))
    }
}