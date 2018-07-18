package smg.tarek.rafa.systemmetricsgroup.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_senior_staff.*
import smg.tarek.rafa.systemmetricsgroup.R
import smg.tarek.rafa.systemmetricsgroup.util.SeniorStaff

class SeniorStaffActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senior_staff)

        // grab intent extra to put info on screen
        if (intent.hasExtra("seniorStaff")) {
            val staffMember = intent.getParcelableExtra<SeniorStaff>("seniorStaff")

            // put name, image, position, and bio on the screen
            staffName.text = staffMember.name

            // set image based on the name of the staff member
            when(staffMember.name) {
                "Tarek Hatata" -> staffPicture.setImageResource(R.drawable.th)
                "William McCullough" -> staffPicture.setImageResource(R.drawable.wm)
                "Tom Choe" -> staffPicture.setImageResource(R.drawable.tc)
                else -> {}
            }

            staffPositionTitle.text = staffMember.position
            staffBio.text = staffMember.bio
        }
    }
}
