package smg.tarek.rafa.systemmetricsgroup.activity

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact.*
import smg.tarek.rafa.systemmetricsgroup.R

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        sfPhoneLine.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + sfPhoneLine.text.toString().replace("-", "")))

            startActivity(intent)
        }

        laPhoneLine.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + laPhoneLine.text.toString().replace("-", "")))

            startActivity(intent)
        }
    }
}
