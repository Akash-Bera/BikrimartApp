package com.example.bikrimartapp


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerifiTextField() {
    val verificationCode = remember { mutableStateListOf("", "", "", "") }
    val focusRequesters = remember { List(4) { FocusRequester() } }
    val isEmpty = remember { mutableStateOf(false) }

    Row {
        for (i in 0 until 4) {
            OutlinedTextField(
                value = verificationCode[i],
                onValueChange = { newValue ->
                    if (newValue.length <= 1) {
                        verificationCode[i] = newValue
                        if (newValue.isNotEmpty()) {
                            focusNextTextField(i, focusRequesters)
                        }
                    }
                },
                textStyle = LocalTextStyle.current.copy(color = Color(0xff25B58A)),
                modifier = Modifier
                    .padding(
                        horizontal = 5.dp
                    )
                    .size(69.dp)
                    .focusRequester(focusRequesters[i]),
                shape = CircleShape,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                maxLines = 1
            )
        }
    }

     LaunchedEffect(Unit) {
        focusRequesters[0].requestFocus()
     }
    }



private fun focusNextTextField(currentIndex: Int, focusRequesters: List<FocusRequester>) {
    if (currentIndex < 3) {
        val nextIndex = currentIndex + 1
        focusRequesters[currentIndex].requestFocus()
        focusRequesters[nextIndex].requestFocus()
    }
}

@Composable
fun VerifiOTP(){
    var otpValue by remember {
        mutableStateOf("")
    }

    BasicTextField(
        value = otpValue,
        onValueChange = {
           if (it.length<=4){
               otpValue = it
           }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword
        ),
        decorationBox = {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                repeat(4){ index ->
                    val input  = when {
                        index >= otpValue.length ->""
                        else -> otpValue[index].toString()
                    }
                    val isFocused = otpValue.length == index
                    Box(
                        modifier = Modifier
                            .size(69.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            modifier = Modifier
                                .size(69.dp)
                                .clip(CircleShape)
                                .background(
                                    if (isFocused) Color.Unspecified else Color(0xff707070).copy(
                                        alpha = .1f
                                    )
                                )
                                .border(
                                    if (isFocused) 1.dp else 0.dp,
                                    if (isFocused) Color(0xffDDDDDD) else Color.Unspecified,
                                    CircleShape
                                )
                                .padding(
                                    start = 26.dp,
                                    top = 17.dp,
                                    end = 28.dp,
                                    bottom = 21.dp

                                ),
                            text = input,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xff25B58A),
                            textAlign = TextAlign.Center
                        )
                        Divider(
                            if (isFocused) Modifier
                                .width(13.dp)
                                .height(2.dp) else Modifier
                                .width(0.dp)
                                .height(0.dp)
                                .padding(top = 0.dp),
                            if(isFocused)2.dp else 0.dp,
                            if(isFocused) Color(0xff707070) else Color.Unspecified
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }

    )
}
