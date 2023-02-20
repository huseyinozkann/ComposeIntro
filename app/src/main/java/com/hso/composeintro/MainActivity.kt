package com.hso.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hso.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIntroTheme {
                // A surface container using the 'background' color from the theme

            }
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    //Col, Row, ,Box
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        CustomText(text = "Hello Android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello World")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello Kotlin")
        Spacer(modifier = Modifier.padding(5.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomText(text = "Text 1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Text 2")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Text 3")
        }
    }
}
@Composable
fun CustomText(text : String){

        Text(modifier = Modifier
            .clickable {
                println("hello android clicked")
            }
            .background(color = Color.Black)
            .padding(top = 10.dp, start = 1.dp, end = 1.dp, bottom = 30.dp)

            //.fillMaxSize() -Tüm ekranı kaplar
            //.fillMaxWidth() - Tüm genişliği kaplar.
            //.fillMaxHeight() - Tüm yüksekliği kaplar.
            //.fillMaxSize(0.5f)
            //.width(150.dp)
            ,text = text,
            color = Color.Green,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}