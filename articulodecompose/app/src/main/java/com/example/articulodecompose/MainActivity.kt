package com.example.articulodecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Establece el contenido de la actividad con el tema adecuado
            MaterialTheme {
                // Superficie para envolver el contenido en un tema común
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    // Llamada a la pantalla que contiene el artículo
                    PantallaArticulo()
                }
            }
        }
    }
}

// Pantalla que contiene todos los elementos del artículo
@Composable
fun PantallaArticulo() {
    // Se crea una columna que contiene todos los elementos
    Column(modifier = Modifier.fillMaxSize()) {

        // Cargar la imagen que ocupa todo el ancho de la pantalla
        val imagen: Painter = painterResource(id = R.drawable.compose_image)  // Verifica que la imagen esté en res/drawable
        Image(
            painter = imagen,
            contentDescription = "Imagen tutorial de Compose",  // Descripción accesible para la imagen
            modifier = Modifier.fillMaxWidth()  // La imagen ocupa todo el ancho disponible
        )

        // Primer Text: Título de la pantalla con un tamaño de fuente de 24sp y padding de 16dp
        Text(
            text = "Jetpack Compose tutorial",  // Título visible en la pantalla
            fontSize = 24.sp,  // Tamaño de fuente de 24sp
            modifier = Modifier.padding(16.dp)  // Padding de 16dp en todas las direcciones
        )

        // Segundo Text: Descripción corta justificada con padding de 16dp en los márgenes izquierdo y derecho
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            style = TextStyle(fontSize = 16.sp),  // Tamaño de fuente predeterminado (16sp)
            textAlign = TextAlign.Justify,  // Alineación justificada del texto
            modifier = Modifier.padding(horizontal = 16.dp)  // Padding de 16dp en los márgenes izquierdo y derecho
        )

        // Tercer Text: Descripción extendida justificada con padding de 16dp en todas las direcciones
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            style = TextStyle(fontSize = 16.sp),  // Tamaño de fuente predeterminado (16sp)
            textAlign = TextAlign.Justify,  // Alineación justificada del texto
            modifier = Modifier.padding(16.dp)  // Padding de 16dp en todas las direcciones
        )
    }
}

// Vista previa de la pantalla de artículo en el editor
@Preview(showBackground = true)
@Composable
fun VistaPreviaPantallaArticulo() {
    PantallaArticulo()  // Llamada a la función para mostrar la vista previa
}
