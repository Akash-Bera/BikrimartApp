package com.example.bikrimartapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


var phoneNo = mutableStateOf("")

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        FirstPart()
        SecondPart()
        Spacer(modifier = Modifier.height(121.dp))
        ThirdPart()
        Spacer(modifier = Modifier.height(70.dp))
        FourthPart()
    }
}

@Composable
fun FourthPart() {
    Box(
        modifier = Modifier
            .padding(
                horizontal = 25.dp
            )
            .fillMaxWidth()
            .height(56.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(Color(0xff25B58A)),
        contentAlignment = Alignment.Center
    ) {
        Text("NEXT",
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun ThirdPart() {
    Column(
        modifier = Modifier
            .padding(
                horizontal = 25.dp
            )
            .fillMaxWidth()
            .background(Color(0xffEEEEEE))
            .clip(RoundedCornerShape(4.dp))
            .padding(
                top = 11.dp,
                start = 19.dp,
                end = 20.dp,
                bottom = 18.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Enter Verification Code",
            color = Color(0xff666666),
            fontWeight = FontWeight.Medium,
            fontSize = 26.sp
        )
        Text("Enter the 4-digit code sent to your Mobile",
            color = Color(0xff222222),
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(28.dp))
        VerifiOTP()
        Spacer(modifier = Modifier.height(14.dp))
        Text("RESEND",
            color = Color(0xff25B58A),
            fontSize = 16.sp
        )
    }
}

@Composable
fun FirstPart() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffFFE78A))
            .padding(
                start = 24.dp,
                bottom = 37.dp
            )
    ) {
        Icon(painter = painterResource(R.drawable.back3x),
            contentDescription = "",
            tint = Color.Unspecified,
            modifier = Modifier
                .padding(
                    start = 1.97.dp
                )
        )
        Spacer(modifier = Modifier.height(20.98.dp))
        Text("Register",
            color = Color(0xff222222),
            fontSize = 26.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text("Enter your mobile number",
            color = Color(0xff222222),
            fontSize = 15.sp
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondPart() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 25.dp,
                top = 71.dp,
                end = 25.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(61.dp)
        ){
            Box(
                modifier = Modifier
                    .height(61.dp)
                    .width(87.dp)
                    //.clip(RoundedCornerShape(4.dp))
                    .border(
                        width = 1.dp,
                        color = Color(0xffDDDDDD),
                        RoundedCornerShape(
                            topStart = 4.dp,
                            bottomStart = 4.dp
                        )
                    )
                    .padding(
                        start = 12.75.dp,
                        //end = 9.dp
                    ),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(painter = painterResource(R.drawable.ic_india),
                        contentDescription = "",
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    CountryCodeField()
                }
            }
            OutlinedTextField(
                value = phoneNo.value,
                onValueChange = {
                    phoneNo.value = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(61.dp),
                trailingIcon = {
                    Icon(painter = painterResource(R.drawable.cancel3x),
                        contentDescription = "",
                        tint = Color.Unspecified
                    )
                },
                shape = RoundedCornerShape(
                    topEnd = 4.dp,
                    bottomEnd = 4.dp
                ),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color(0xffE4E4E4)
                )
            )
        }
        Spacer(modifier = Modifier.height(22.dp))
        Text(
            buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        fontSize = 16.sp,
                        color = Color(0xff7C7D7E)
                    )
                ){
                    append("Already have an Account?")
                }
                withStyle(
                    SpanStyle(
                        fontSize = 16.sp,
                        color = Color(0xff25B58A),
                        fontWeight = FontWeight.Bold
                    )
                ){
                    append(" Login")
                }
            }
        )
    }
}
