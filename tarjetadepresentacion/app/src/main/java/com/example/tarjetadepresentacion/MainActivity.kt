package com.example.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionUI()
        }
    }
}

@Composable
fun TarjetaDePresentacionUI() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEFEFEF) // Fondo gris claro
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ) {
                    // Imagen de perfil
                    Image(
                        painter = painterResource(id = R.drawable.foto),
                        contentDescription = "Foto de Alejandro",
                        modifier = Modifier
                            .size(120.dp)
                            .padding(8.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Nombre completo
                    Text(
                        text = "Alejandro Quispe Tufino",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )

                    // Carrera y universidad
                    Text(
                        text = "Ingeniería de Sistemas - UNMSM",
                        fontSize = 16.sp,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Información de contacto
                    InformacionDeContacto(
                        telefono = "978210622",
                        correo = "alejandro.quispe5@unmsm.edu.pe"
                    )
                }
            }
        }
    }
}

@Composable
fun InformacionDeContacto(telefono: String, correo: String) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Teléfono",
                tint = Color(0xFF3DDC84)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = telefono, fontSize = 16.sp)
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Correo electrónico",
                tint = Color(0xFF3DDC84)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = correo, fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TarjetaDePresentacionPreview() {
    TarjetaDePresentacionUI()
}


