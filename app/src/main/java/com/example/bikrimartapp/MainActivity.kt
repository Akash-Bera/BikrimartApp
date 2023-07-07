package com.example.bikrimartapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bikrimartapp.ui.theme.BikrimartAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BikrimartAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Register()
                }
            }
        }
    }
}




/*@Composable
fun DropdownMenu() {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("") }

    Column {
        Text("Selected option: $selectedOption")
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(20.dp)
        ) {
            DropdownMenuItem(
                { Text("Option 1") },
                onClick = {
                selectedOption = "Option 1"
                expanded = false
            })
            DropdownMenuItem(
                { Text("Option 1") },
                onClick = {
                    selectedOption = "Option 1"
                    expanded = false
                })
            DropdownMenuItem(
                { Text("Option 1") },
                onClick = {
                    selectedOption = "Option 1"
                    expanded = false
                })
        }
    }
}*/


@Composable
fun Login(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 270.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(painter = painterResource(R.drawable.bikrimart3x),
                contentDescription = "",
                tint = Color.Unspecified
        )
        Spacer(modifier = Modifier.height(192.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 25.dp
                ),
            horizontalAlignment = Alignment.End
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color(0xff25B58A))
                    .clickable { },
                contentAlignment = Alignment.Center
            )
            {
                Text("LOGIN",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(23.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xff25B58A),
                        RoundedCornerShape(4.dp)
                    )
                    .clickable { },
                contentAlignment = Alignment.Center
            )
            {
                Text("CREATE AN ACCOUNT",
                    color = Color(0xff25B58A),
                    fontSize = 16.sp
                )
            }
        }
    }
}


@Composable
fun SplashScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff25B58A)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(painter = painterResource(R.drawable.ic_bike),
            contentDescription = "",
            tint = Color.Unspecified,
            modifier = Modifier
                .size(100.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("BIKRIMART",
            color = Color.White,
            fontSize = 35.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("DELIVERY",
            color = Color(0xffFFE78A),
            fontSize = 18.sp
        )
    }
}



@Composable
fun Splash1(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                start = 25.dp,
                top = 92.8.dp,
                end = 25.5.dp,
                //bottom = 37.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_order),
            contentDescription = "",
            tint = Color.Unspecified,
            modifier = Modifier
                .height(442.75.dp)
                .width(363.5.dp)
        )
        Spacer(modifier = Modifier.height(30.51.dp))
        Text("Online Delivery",
            color = Color(0xff353535),
            fontSize = 35.sp
        )
        Spacer(modifier = Modifier.height(13.95.dp))
        Text("Lorem Ipsum Lorem Ipsum is simply dummy text of the printing and is simply dummy text of the printing and typesetting industry.",
            color = Color(0xff353535),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            maxLines = 3,
            modifier = Modifier

        )
        Spacer(modifier = Modifier.height(33.37.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(11.73.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .border(
                        width = 4.dp,
                        color = Color(0xff4D5DDA),
                        CircleShape
                    )
            )
            Spacer(modifier = Modifier.width(14.32.dp))
            Box(
                modifier = Modifier
                    .size(4.75.dp)
                    .clip(CircleShape)
                    .background(Color(0xff4D5DDA))
            )
            Spacer(modifier = Modifier.width(17.87.dp))
            Box(
                modifier = Modifier
                    .size(4.75.dp)
                    .clip(CircleShape)
                    .background(Color(0xff4D5DDA))
            )
        }
        Spacer(modifier = Modifier.height(33.97.dp))
        Box(
            modifier = Modifier
                .width(194.dp)
                .height(47.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(50.dp))
                .background(Color(0xff25B58A)),
            contentAlignment = Alignment.Center
        ) {
            Text("Next",
                color = Color.White,
                fontSize = 17.sp,
            )
        }
    }
}


@Composable
fun Splash2(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                top = 218.07.dp
            )
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_fast_delivery),
            contentDescription = "",
            tint = Color.Unspecified,
            modifier = Modifier
                .height(304.78.dp)
                .width(388.1.dp)
                .padding(
                    horizontal = 12.95.dp
                )
        )
        Spacer(modifier = Modifier.height(43.2.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(
                    start = 25.dp,
                    end = 26.dp,
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Fast Delivery",
                color = Color(0xff353535),
                fontSize = 35.sp
            )
            Spacer(modifier = Modifier.height(13.95.dp))
            Text("Lorem Ipsum Lorem Ipsum is simply dummy text of the printing and is simply dummy text of the printing and typesetting industry.",
                color = Color(0xff353535),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                maxLines = 3,
                modifier = Modifier

            )
            Spacer(modifier = Modifier.height(33.37.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(4.75.dp)
                        .clip(CircleShape)
                        .background(Color(0xff4D5DDA))
                )
                Spacer(modifier = Modifier.width(14.32.dp))
                Box(
                    modifier = Modifier
                        .size(11.73.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(
                            width = 4.dp,
                            color = Color(0xff4D5DDA),
                            CircleShape
                        )
                )
                Spacer(modifier = Modifier.width(14.38.dp))
                Box(
                    modifier = Modifier
                        .size(4.75.dp)
                        .clip(CircleShape)
                        .background(Color(0xff4D5DDA))
                )
            }
            Spacer(modifier = Modifier.height(33.97.dp))
            Box(
                modifier = Modifier
                    .width(194.dp)
                    .height(47.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color(0xff25B58A)),
                contentAlignment = Alignment.Center
            ) {
                Text("Next",
                    color = Color.White,
                    fontSize = 17.sp,
                )
            }
        }
    }
}


@Composable
fun Splash3(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                top = 218.07.dp
            )
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_good_service),
            contentDescription = "",
            tint = Color.Unspecified,
            modifier = Modifier
                .height(295.8.dp)
                .width(388.1.dp)
                .padding(
                    horizontal = 19.95.dp
                )
        )
        Spacer(modifier = Modifier.height(43.2.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(
                    start = 25.dp,
                    end = 26.dp,
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Good Services",
                color = Color(0xff353535),
                fontSize = 35.sp
            )
            Spacer(modifier = Modifier.height(13.95.dp))
            Text("Lorem Ipsum Lorem Ipsum is simply dummy text of the printing and is simply dummy text of the printing and typesetting industry.",
                color = Color(0xff353535),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                maxLines = 3,
                modifier = Modifier

            )
            Spacer(modifier = Modifier.height(33.37.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(4.75.dp)
                        .clip(CircleShape)
                        .background(Color(0xff4D5DDA))
                )
                Spacer(modifier = Modifier.width(17.87.dp))
                Box(
                    modifier = Modifier
                        .size(4.75.dp)
                        .clip(CircleShape)
                        .background(Color(0xff4D5DDA))
                )
                Spacer(modifier = Modifier.width(14.32.dp))
                Box(
                    modifier = Modifier
                        .size(11.73.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(
                            width = 4.dp,
                            color = Color(0xff4D5DDA),
                            CircleShape
                        )
                )
            }
            Spacer(modifier = Modifier.height(33.97.dp))
            Box(
                modifier = Modifier
                    .width(194.dp)
                    .height(47.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color(0xff25B58A)),
                contentAlignment = Alignment.Center
            ) {
                Text("Next",
                    color = Color.White,
                    fontSize = 17.sp,
                )
            }
        }
    }
}