package com.example.kotlinappcon


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.util.Log

class AddContractActivity : AppCompatActivity() {
    lateinit var contractNumberEditText: EditText
    lateinit var contractTypeEditText: EditText
    lateinit var contractValidityEditText: EditText
    lateinit var contractValueEditText: EditText
    lateinit var contractAgentEditText: EditText
    lateinit var contractClientEditText: EditText
    lateinit var saveContractButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contract)

        contractNumberEditText = findViewById(R.id.contractNumberEditText)
        contractTypeEditText = findViewById(R.id.contractTypeEditText)
        contractValidityEditText = findViewById(R.id.contractValidityEditText)
        contractValueEditText = findViewById(R.id.contractValueEditText)
        contractAgentEditText = findViewById(R.id.contractAgentEditText)
        contractClientEditText = findViewById(R.id.contractClientEditText)
        saveContractButton = findViewById(R.id.saveContractButton)

        saveContractButton.setOnClickListener {
            // Here you can add code to save the contract
            // For now, let's just log the contract details
            val contractNumber = contractNumberEditText.text.toString()
            val contractType = contractTypeEditText.text.toString()
            val contractValidity = contractValidityEditText.text.toString()
            val contractValue = contractValueEditText.text.toString()
            val contractAgent = contractAgentEditText.text.toString()
            val contractClient = contractClientEditText.text.toString()
            Log.i("ContractDetails", "Number: $contractNumber, Type: $contractType, Validity: $contractValidity, Value: $contractValue, Agent: $contractAgent, Client: $contractClient")
            val intent = Intent(this, ClientSpace::class.java)
            startActivity(intent)
            // Finish current activity to prevent going back to it when pressing back button from MainActivity
            finish()
        }}}

