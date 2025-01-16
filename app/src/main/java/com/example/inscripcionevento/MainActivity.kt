package com.example.inscripcionevento

import android.os.Bundle
import android.widget.RadioButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.inscripcionevento.ui.theme.InscripcionEventoTheme
import androidx.compose.material3.RadioButton


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InscripcionEventoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var nombre by remember { mutableStateOf("") }
    var gmail by remember { mutableStateOf("") }
    var Opcion by remember { mutableStateOf(true) } // true para Sí, false para No


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(
            text = "Inscripcion a un Eveto",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "Nombre")
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Ingresa Tu Nombre") }
        )

        Text(text = "Gmail")
        OutlinedTextField(
            value = gmail,
            onValueChange = { gmail = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("@gmail/@outlok.com") }
        )

        Text(text = "Asistira al Evneto?")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = Opcion,
                onClick = { Opcion = true }
            )
            Text(
                text = "Sí",
                modifier = Modifier.padding(start = 8.dp)
            )

            RadioButton(
                selected = !Opcion,
                onClick = { Opcion = false }
            )
            Text(
                text = "No",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Button(onClick = {/*TODO*/ } ) {
            Text(text = "INSCRIBIRSEE")
        }

        


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InscripcionEventoTheme {
        Greeting("Android")
    }
}