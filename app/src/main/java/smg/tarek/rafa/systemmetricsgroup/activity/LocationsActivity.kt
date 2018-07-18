package smg.tarek.rafa.systemmetricsgroup.activity

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_locations.*
import smg.tarek.rafa.systemmetricsgroup.R
import java.net.URLEncoder

class LocationsActivity : AppCompatActivity() {

    private val sfAddress = "12 Geary Street Suite 705 San Francisco, CA 94108"
    private val laAddress = "510 West 6th Street Suite 1006 Los Angeles, CA 90014"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locations)

        sfDirections.setOnClickListener {
            val encodedDirections = URLEncoder.encode(sfAddress, "UTF-8")
            val intentUri = Uri.parse("geo:0,0?q=" + encodedDirections)

            val mapIntent = Intent(Intent.ACTION_VIEW, intentUri)
            mapIntent.setPackage("com.google.android.apps.maps")

            startActivity(mapIntent)
        }

        laDirections.setOnClickListener {
            val encodedDirections = URLEncoder.encode(laAddress, "UTF-8")
            val intentUri = Uri.parse("geo:0,0?q=" + encodedDirections)

            val mapIntent = Intent(Intent.ACTION_VIEW, intentUri)
            mapIntent.setPackage("com.google.android.apps.maps")

            startActivity(mapIntent)
        }
    }
}
