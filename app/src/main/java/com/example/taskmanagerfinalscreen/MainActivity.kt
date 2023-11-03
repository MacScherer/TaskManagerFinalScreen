package com.example.taskmanagerfinalscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerfinalscreen.ui.theme.TaskManagerFinalScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerFinalScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CompleteTaskCardApp()
                }
            }
        }
    }
}
@Composable
fun CompleteTaskCardApp() {
    CompleteTaskCard(
        imagePainter = painterResource(R.drawable.ic_task_completed),
        taskCompletedString = "All tasks completed\n",
        niceWorkString = "Nice work!\n")
}

@Composable
private fun CompleteTaskCard(
    imagePainter: Painter,
    taskCompletedString: String,
    niceWorkString: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Center
    ) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = taskCompletedString,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(top = 24.dp)
        )
        Text(
            text = niceWorkString,
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerFinalScreenTheme {
        CompleteTaskCardApp()
    }
}


