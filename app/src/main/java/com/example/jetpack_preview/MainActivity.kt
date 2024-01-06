package com.example.jetpack_preview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_preview.ui.theme.Jetpack_PreviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_PreviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingMain()
                }
            }
        }
    }
}



// task manager finally page

@Composable
fun GreetingMain(modifier: Modifier = Modifier) {
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
        Text (
            text = "All tasks completed",
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,
        )
        Text (
            text = "Nice work!",
            fontSize = 16.sp,
        )
    }

}


// wiki example


//@Composable
//fun GreetingMain(modifier: Modifier = Modifier) {
//    val img = painterResource(R.drawable.bg_compose_background)
//    Column(
//        modifier = modifier.fillMaxSize()
//    ) {
//        Image(
//            painter =  img,
//            contentDescription = null,
//        )
//        Text(
//            text = stringResource(R.string.jetpack_title1),
//            modifier = modifier.padding(16.dp),
//            fontSize = 24.sp,
//        )
//        Text(
//            text = stringResource(R.string.jetpack_preview_description1),
//            modifier = modifier.padding(start = 16.dp, end = 16.dp),
//            textAlign = TextAlign.Justify,
//        )
//        Text (
//            text = stringResource(R.string.jetpack_description1),
//            modifier = modifier.padding(16.dp),
//            textAlign = TextAlign.Justify,
//        )
//    }
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack_PreviewTheme {
        GreetingMain()
    }
}