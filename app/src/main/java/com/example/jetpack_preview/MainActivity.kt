package com.example.jetpack_preview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_preview.ui.theme.Jetpack_PreviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_PreviewTheme {
                BusinessCard()
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF4C566A)
    ) {
        GreetingLogo(modifier = Modifier.fillMaxSize())
        GreetingCredits(modifier = Modifier.fillMaxSize())
    }
}

@Composable
fun GreetingLogo(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier.padding(20.dp),
        ) {
            val img = painterResource(R.drawable.android_logo)
            Image (
                painter = img,
                contentDescription = "Android Logo",
                modifier = Modifier
                    .background(Color(0xFF5E81AC), shape = RoundedCornerShape(25.dp))
                    .size(200.dp)
            )
        }
        Text(
            text = "Vladimir Mukhin",
            textAlign = TextAlign.Justify,
            color = Color(0xFF8FBCBB),
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Text(
            text = "Android developer",
            textAlign = TextAlign.Justify,
            color = Color(0xFFB48EAD),
        )
    }
}

@Composable
fun GreetingCredits(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
    ) {
        Column {
            Row {
                Icon(
                    tint = Color(0xFF88C0D0),
                    modifier = Modifier.padding(end = 10.dp),
                    painter = painterResource(R.drawable.mail_ico),
                    contentDescription = null
                )
                Text(
                    text = "mukhinva2@gmail.com",
                    textAlign = TextAlign.Justify,
                    color = Color(0xFF8FBCBB),
                )
            }
            Row {
                Icon(
                    tint = Color(0xFF88C0D0),
                    modifier = Modifier.padding(end = 10.dp),
                    painter = painterResource(R.drawable.share_ico),
                    contentDescription = null
                )
                Text(
                    text = "@Spoo0k",
                    textAlign = TextAlign.Justify,
                    color = Color(0xFF8FBCBB),
                )
            }
            Row {
                Icon(
                    tint = Color(0xFF88C0D0),
                    modifier = Modifier.padding(end = 10.dp),
                    painter = painterResource(R.drawable.phone_ico),
                    contentDescription = null
                )
                Text(
                    text = "+7(916)123-45-67",
                    textAlign = TextAlign.Justify,
                    color = Color(0xFF8FBCBB),
                )
            }
        }
    }
}





//// rectangle task

@Preview (showBackground = true)
@Composable
fun RectangleTask() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF4C566A)
    ) {
        Column(
            Modifier.fillMaxWidth()
        ) {
            Row(Modifier.weight(1f)) {
                CreateNode(
                    title = stringResource(R.string.title_1),
                    description = stringResource(R.string.description_1),
                    color = colorResource(R.color.color_1),
                    modifier = Modifier.weight(1f)
                )
                CreateNode(
                    title = stringResource(R.string.title_2),
                    description = stringResource(R.string.description_2),
                    color = colorResource(R.color.color_2),
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f)) {
                CreateNode(
                    title = stringResource(R.string.title_3),
                    description = stringResource(R.string.description_3),
                    color = colorResource(R.color.color_3),
                    modifier = Modifier.weight(1f)
                )
                CreateNode(
                    title = stringResource(R.string.title_4),
                    description = stringResource(R.string.description_4),
                    color = colorResource(R.color.color_4),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun CreateNode(title: String, description: String, modifier: Modifier = Modifier, color: Color) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}


/// task manager finally page

@Preview (showBackground = true)
@Composable
fun TaskManagerFinallyPage(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF4C566A)
    ) {
        val img = painterResource(R.drawable.ic_task_completed)
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Image(
                painter = img,
                contentDescription = null,
                alpha = 0.7f,
            )
            Text(
                text = "All tasks completed",
                modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF8FBCBB),
            )
            Text(
                text = "Nice work!",
                fontSize = 16.sp,
                color = Color(0xFF8FBCBB),
            )
        }
    }
}


/// wiki example

@Preview (showBackground = true)
@Composable
fun WikiPage(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF4C566A)
    ) {
        val img = painterResource(R.drawable.bg_compose_background)
        Column(
            modifier = modifier.fillMaxSize()
        ) {
            Image(
                painter = img,
                contentDescription = null,
            )
            Text(
                text = stringResource(R.string.jetpack_title1),
                modifier = modifier.padding(16.dp),
                fontSize = 24.sp,
                color = Color(0xFF8FBCBB),
            )
            Text(
                text = stringResource(R.string.jetpack_preview_description1),
                modifier = modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify,
                color = Color(0xFF8FBCBB),
            )
            Text(
                text = stringResource(R.string.jetpack_description1),
                modifier = modifier.padding(16.dp),
                textAlign = TextAlign.Justify,
                color = Color(0xFF8FBCBB),
            )
        }
    }
}