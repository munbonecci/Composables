package com.mun.bonecci.composables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mun.bonecci.composables.components.AnimatedProgressBar
import com.mun.bonecci.composables.components.composables_icons.rememberAndroid
import com.mun.bonecci.composables.ui.theme.ComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposablesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TestAnimatedProgressBar("Animated progress bar")
                }
            }
        }
    }
}

@Composable
fun TestAnimatedProgressBar(name: String, modifier: Modifier = Modifier) {
    val nums = listOf(98, 65,70)

    LazyColumn(
        modifier = Modifier.padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        items(nums) { num ->
            Box(
                modifier = modifier
                    .padding(all = 16.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Text(text = name, fontSize = 15.sp)
                    AnimatedProgressBar(indicatorProgress = num)
                    Icon(imageVector = rememberAndroid(), contentDescription = "Android Icon")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposablesTheme {
        TestAnimatedProgressBar("Android")
    }
}