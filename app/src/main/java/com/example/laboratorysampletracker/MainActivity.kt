package com.example.laboratorysampletracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                LaboratorySampleTracker()
            }
        }
    }
}

@Composable
fun LaboratorySampleTracker() {
    var department by remember { mutableStateOf("") }
    var sampleId by remember { mutableStateOf("") }
    var dateReceived by remember { mutableStateOf("") }
    var testType by remember { mutableStateOf("") }
    var priority by remember { mutableStateOf("") }
    var sampleStatus by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Laboratory Sample Tracker",
            style = MaterialTheme.typography.headlineMedium
        )

        Text("Enter laboratory sample information")

        ExposedDropdownMenu(
        expanded = departmentMenuExpanded,
        onDismissRequest = { departmentMenuExpanded = false }
    ) {
        listOf(
            "Controlled Substance",
            "Trade",
            "Other Forensics"
        ).forEach { option ->
            DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                    department = option
                    departmentMenuExpanded = false
                }
            )
        }
    }
}



        OutlinedTextField(
            value = sampleId,
            onValueChange = { sampleId = it },
            label = { Text("Sample ID") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = dateReceived,
            onValueChange = { dateReceived = it },
            label = { Text("Date Received") },
            placeholder = { Text("MM/DD/YYYY") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = testType,
            onValueChange = { testType = it },
            label = { Text("Test Type") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = priority,
            onValueChange = { priority = it },
            label = { Text("Priority: Normal, High, Urgent") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = sampleStatus,
            onValueChange = { sampleStatus = it },
            label = { Text("Status: Pending, In Progress, Completed") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                message = if (
                    department.isBlank()||
                    sampleId.isBlank() ||
                    dateReceived.isBlank() ||
                    testType.isBlank()
                ) {
                    "Please complete the required fields."
                } else {
                    "Sample $sampleId entered successfully!"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save Sample")
        }

        if (message.isNotEmpty()) {
            Text(message)
        }
    }
}
