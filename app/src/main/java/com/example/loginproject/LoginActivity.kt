package com.example.loginproject


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginproject.ui.theme.LoginProjectTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            login()
        }
    }

    @Preview
    @Composable
    private fun login() {
        Column(
            Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),
            horizontalAlignment = Alignment.CenterHorizontally
        )

        {
            Image(
                painter = painterResource(id = R.drawable.top_background),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )

            Image(
                painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.height(150.dp)
            )

            Text(
                "Welcome to Uilover",
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#7d32a8"))
            )
            var user by remember { mutableStateOf("Username") }
            var pass by remember { mutableStateOf("Password") }
            var passwordvisible by rememberSaveable() { mutableStateOf(false) }


            TextField(
                value = user, { text -> user = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp)
                    .border(
                        1.dp, Color(android.graphics.Color.parseColor("#7d32a8")),
                        shape = RoundedCornerShape(50)
                    ),
                shape = RoundedCornerShape(50),
                textStyle = TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color(android.graphics.Color.parseColor("#7d32a8")),
                    fontSize = 14.sp
                ), colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            TextField(
                value = pass,
                { text -> pass = text },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp)
                    .border(
                        1.dp, Color(android.graphics.Color.parseColor("#7d32a8")),
                        shape = RoundedCornerShape(50)
                    ),
                shape = RoundedCornerShape(50),
                textStyle = TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color(android.graphics.Color.parseColor("#7d32a8")),
                    fontSize = 14.sp
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                visualTransformation = if (passwordvisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Button(
                onClick = {/*TODO*/ },
                Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(start = 64.dp, end = 64.dp, top = 8.dp, bottom = 8.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#7d32a8"))
                ),
                shape = RoundedCornerShape(50)
            )
            {
                Text(
                    text = "login",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = "Don't remember password? click here",
                Modifier.padding(top = 8.dp, bottom = 8.dp),
                fontSize = 14.sp,
                color = Color(android.graphics.Color.parseColor("#7d32a8"))
            )

            Row() {

                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "",
                    Modifier.padding(8.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "",
                    Modifier.padding(8.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "",
                    Modifier.padding(8.dp)
                )
            }

            Image(
                painter = painterResource(id=R.drawable.bottom_background)
                , contentDescription = ""
                , contentScale = ContentScale.FillBounds
                       , modifier = Modifier.padding(top = 16.dp)
            )

        }

    }
}

