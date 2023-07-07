package com.example.bikrimartapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountryCode() {
    val countryCodes = remember {
        mutableStateListOf(
            "+1", "+91", "+44" // Add more country codes as needed
        )
    }
    val selectedCountryCode = remember { mutableStateOf(countryCodes[0]) }
    val isDropdownExpanded = remember { mutableStateOf(false) }

    Row(modifier = Modifier.fillMaxWidth()) {
        // Country code dropdown
        BasicTextField(
            value = selectedCountryCode.value,
            onValueChange = { selectedCountryCode.value = it },
            readOnly = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier
                .width(26.dp)
                .height(23.dp)
        )
        DropdownMenu(
            expanded = isDropdownExpanded.value,
            onDismissRequest = { isDropdownExpanded.value = false}
        ) {
            countryCodes.forEach { countryCode ->
                DropdownMenuItem(
                    { Text(text = countryCode) },
                    onClick = {
                    selectedCountryCode.value = countryCode
                    isDropdownExpanded.value = true
                })
            }
        }

    }
}

@Composable
fun CountryCodePicker(
    selectedCountryCode: String,
    onCountryCodeSelected: (String) -> Unit
) {
    val countryCodes = listOf(
        "+1", "+91", "+44" // Add more country codes as needed
    )

    var expanded = remember { mutableStateOf(false) }

    Box(modifier = Modifier.wrapContentSize()) {
        Text(
            text = selectedCountryCode,
            modifier = Modifier.clickable { expanded.value = true }
        )

        DropdownMenu(
            expanded = expanded.value,
            onDismissRequest = { expanded.value = false }
        ) {
            countryCodes.forEach { code ->
                DropdownMenuItem(
                    { Text(text = code,
                        color = Color(0xff303030),
                        fontSize = 16.sp
                    ) },
                    onClick = {
                        onCountryCodeSelected(code)
                        expanded.value = false
                    }
                )
            }
        }
    }
}

@Composable
fun CountryCodeField() {
    var selectedCountryCode = remember { mutableStateOf("+91") }

    Box(
        modifier = Modifier
            .height(23.dp)
            .fillMaxWidth()
    ) {
        CountryCodePicker(
            selectedCountryCode = selectedCountryCode.value,
            onCountryCodeSelected = { countryCode ->
                selectedCountryCode.value = countryCode
            }
        )
    }
}


