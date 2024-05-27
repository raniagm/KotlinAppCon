package com.example.kotlinappcon

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.cardview.widget.CardView

class ClientSpace : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_space)

        val contractCard: CardView = findViewById(R.id.contractCard)
        val profileCard: CardView = findViewById(R.id.profileCard)
        val dashboardCard: CardView = findViewById(R.id.dashboardCard)
        val logoutCard: CardView = findViewById(R.id.logoutCard)

        contractCard.setOnClickListener {
            Toast.makeText(this, "Gestion de Contrats clicked", Toast.LENGTH_SHORT).show()
            // Add intent to navigate to the Add contract activity
            val intent = Intent(this, AddContractActivity::class.java)
            startActivity(intent)
        }

        profileCard.setOnClickListener {
            Toast.makeText(this, "Visiter votre profil clicked", Toast.LENGTH_SHORT).show()
            // Add intent to navigate to the profile activity
        }

        dashboardCard.setOnClickListener {
            Toast.makeText(this, "Tableau de bord clicked", Toast.LENGTH_SHORT).show()
            // Add intent to navigate to the dashboard activity
        }

        logoutCard.setOnClickListener {
            Toast.makeText(this, "Se déconnecter clicked", Toast.LENGTH_SHORT).show()
            // Handle logout
        }
    }
}