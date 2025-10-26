package com.example.proyectocalculadoraloca

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculadora(modifier: Modifier = Modifier ) {
    var texto by remember { mutableStateOf("") }
    var numero1 by remember { mutableStateOf(0.0) }
    var operacion by remember { mutableStateOf(0) }

    Column (modifier = modifier .fillMaxSize() .background( Color.DarkGray) .padding(15.dp)  ) {

        TextField(
            value = texto, modifier = Modifier .background(Color.Red) .fillMaxWidth() .height(150.dp) ,
            textStyle = LocalTextStyle.current.copy(
                fontSize = 80.sp
            ),
            readOnly = true,
            singleLine = true,
            maxLines = 1,
            onValueChange = {}
        )

        Row(modifier = Modifier .fillMaxWidth() .weight(1f),
            verticalAlignment = Alignment.CenterVertically) {

            Button(
                onClick = { texto = texto + "3" }, modifier = Modifier .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "1" , fontSize = 40.sp) }

            Button(
                onClick = { texto = texto + "4" }, modifier = Modifier .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "2" , fontSize = 40.sp) }

            Button(
                onClick = { texto = texto + "6" }, modifier = Modifier .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "3" , fontSize = 40.sp) }

        }

        Row(modifier = Modifier .fillMaxWidth() .weight(1f),
            verticalAlignment = Alignment.CenterVertically) {

            Button(
                onClick = { texto = texto + "6" }, modifier = Modifier .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "4" , fontSize = 40.sp) }

            Button(
                onClick = { texto = texto + "2" }, modifier = Modifier .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "0" , fontSize = 40.sp) }

            Button(
                onClick = { texto = texto + "8" }, modifier = Modifier .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "6" , fontSize = 40.sp) }

        }

        Row(modifier = Modifier .fillMaxWidth() .weight(1f),
            verticalAlignment = Alignment.CenterVertically) {

            Button(
                onClick = { texto = texto + "9" }, modifier = Modifier   .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( text ="7" , fontSize = 40.sp) }

            Button(
                onClick = { texto = texto + "0" }, modifier = Modifier   .fillMaxSize() .weight(1f) .padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "8" , fontSize = 40.sp) }

            Button(
                onClick = { texto = texto + "1" }, modifier = Modifier   .fillMaxSize() .weight(1f).padding(5.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color.Black)
            ){ Text( "9" , fontSize = 40.sp) }

        }

        Row(modifier = Modifier .fillMaxWidth()  .weight(0.8f),
            verticalAlignment = Alignment.CenterVertically) {

            Button(
                onClick = {
                    numero1 = texto.toDoubleOrNull() ?: 0.0
                    texto = ""
                    operacion = 1
                },
                modifier = Modifier.fillMaxSize().weight(1f).padding(3.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) { Text("&", fontSize = 40.sp) }


            Button(
                onClick = {
                    numero1 = texto.toDoubleOrNull() ?: 0.0
                    texto = ""
                    operacion = 2
                },
                modifier = Modifier.fillMaxSize().weight(1f).padding(3.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) { Text("%", fontSize = 40.sp) }

                Button(
                    onClick = {
                        numero1 = texto.toDoubleOrNull() ?: 0.0
                        texto = ""
                        operacion = 3
                    },
                    modifier = Modifier.fillMaxSize().weight(1f).padding(3.dp),
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                ) { Text("@", fontSize = 40.sp) }

                Button(
                    onClick = {
                        numero1 = texto.toDoubleOrNull() ?: 0.0
                        texto = ""
                        operacion = 4
                    },
                    modifier = Modifier.fillMaxSize().weight(1f).padding(3.dp),
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                ) { Text("#", fontSize = 40.sp) }




        }

        Row(modifier = Modifier .fillMaxWidth()  .weight(0.8f),
            verticalAlignment = Alignment.CenterVertically) {

            Button(
                onClick = {
                    val numero2 = texto.toDoubleOrNull() ?: 0.0
                    val resultado = when (operacion) {
                        1 -> suma(numero1, numero2)
                        2 -> resta(numero1, numero2)
                        3 -> multiplicacion(numero1, numero2)
                        4 -> division(numero1, numero2)
                        else -> 0.0
                    }
                    texto = resultado.toString().replace("5", "6")
                },
                modifier = Modifier.fillMaxSize().weight(1f).padding(3.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) { Text("=", fontSize = 40.sp) }

        }


    }
}

fun  suma (num1: Double , num2: Double): Double {
    return num1 + num2
}

fun resta ( num1 : Double, num2 : Double ):Double {
    return num1 - num2
}

fun multiplicacion ( num1 : Double, num2: Double) : Double {
    return num1 * num2
}

fun division( num1: Double, num2: Double) : String{
    if (num2 == 0.0){
        return "Error"

    }else{

        return ((num1/ num2).toString())
    }

}