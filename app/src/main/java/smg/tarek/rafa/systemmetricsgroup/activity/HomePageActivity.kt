package smg.tarek.rafa.systemmetricsgroup.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import smg.tarek.rafa.systemmetricsgroup.R

class HomePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val locationButton = findViewById<Button>(R.id.locationButton)
        val seniorStaffButton = findViewById<Button>(R.id.seniorStaffButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        locationButton.setOnClickListener {
            val intent = Intent(this@HomePageActivity, LocationsActivity::class.java)

            startActivity(intent)
        }

        seniorStaffButton.setOnClickListener {
            val intent = Intent(this@HomePageActivity, SeniorStaffListActivity::class.java)

            startActivity(intent)
        }

        contactButton.setOnClickListener {
            val intent = Intent(this@HomePageActivity, ContactActivity::class.java)

            startActivity(intent)
        }
    }
}
