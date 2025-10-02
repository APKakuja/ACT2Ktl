package com.example.act2ktl

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
import androidx.core.util.rangeTo
import com.example.act2ktl.ui.theme.ACT2KtlTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ACT2KtlTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    botDeSeguretat()
                }
            }
        }
    }

}

val yo = Persona (
    name = "Adrian",
    age = 26,
    entreteniments = listOf("Videogames,Music,Sewing")
)


fun botDeSeguretat() {
 if (yo.name != "Adrian" ) {
println("Error youre not Adrian")
 }
    else (println("Welcome Adrian"))
when (yo.age) {
    in 0..17 -> println("Es menor de edad")
}
    println("Acces denegat")
when (yo.age) {
    in 65..100 -> println("Too old")
}
    println("Acces denegat")

    if (yo.age in 18..64) {
        println("Welcome")
        println(yo.entreteniments)
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
    ACT2KtlTheme {
        Greeting("Android")
    }
}