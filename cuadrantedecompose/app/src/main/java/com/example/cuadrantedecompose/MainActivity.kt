package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaCuadrantes()
        }
    }
}

/**
 * Pantalla principal que divide el espacio en 4 cuadrantes.
 */
@Composable
fun PantallaCuadrantes() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Fila superior (dos cuadrantes)
        Row(modifier = Modifier.weight(1f)) {
            Cuadrante(
                titulo = "Text composable",
                descripcion = "Displays text and follows the recommended Material Design guidelines.",
                colorFondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                titulo = "Image composable",
                descripcion = "Creates a composable that lays out and draws a given Painter class object.",
                colorFondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        // Fila inferior (dos cuadrantes)
        Row(modifier = Modifier.weight(1f)) {
            Cuadrante(
                titulo = "Row composable",
                descripcion = "A layout composable that places its children in a horizontal sequence.",
                colorFondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                titulo = "Column composable",
                descripcion = "A layout composable that places its children in a vertical sequence.",
                colorFondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

/**
 * Composable que representa un cuadrante con fondo de color, padding y contenido centrado.
 */
@Composable
fun Cuadrante(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp), // padding de 16dp en todos los lados
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Texto del título en negrita y con padding inferior de 16dp
            Text(
                text = titulo,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            // Texto de la descripción justificado
            Text(
                text = descripcion,
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.bodyMedium // tamaño de fuente por defecto
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPrevia() {
    PantallaCuadrantes()
}
