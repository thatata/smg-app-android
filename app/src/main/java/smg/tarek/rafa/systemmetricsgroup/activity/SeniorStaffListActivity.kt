package smg.tarek.rafa.systemmetricsgroup.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_senior_staff_list.*
import smg.tarek.rafa.systemmetricsgroup.R
import smg.tarek.rafa.systemmetricsgroup.util.SeniorStaff
import smg.tarek.rafa.systemmetricsgroup.util.SeniorStaffAdapter

class SeniorStaffListActivity : AppCompatActivity() {
    private lateinit var seniorStaffAdapter : SeniorStaffAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senior_staff_list)

        // create list of senior staff members
        val tarek : SeniorStaff = SeniorStaff("Tarek Hatata","President",
                "Tarek Hatata is respected throughout California for his thought leadership in transportation planning and policy. He has more than 25 years of experience leading large-scale projects requiring multi-disciplinary teams. He is known for his ability to work with the most technical and complicated issues and to synthesize their importance to diverse constituencies.")

        val bill : SeniorStaff = SeniorStaff("William McCullough", "Partner",
                "William McCullough has more than 19 years of experience designing and developing decision support systems, especially in the areas of multi-modal transportation planning and operations computer-aided tools, Geographic Information System (GIS) databases, and travel demand forecast modeling. Mr. McCullough is an expert in highway congestion monitoring and has several years experience in transit planning and system design.")

        val tom : SeniorStaff = SeniorStaff("Tom Choe", "Partner",
                "Tom Choe has more than 22 years experience as a transportation professional. Prior to joining System Metrics Group, he served as an Office Chief and Supervising Traffic Engineer for Caltrans District 7 in Los Angeles and a Principal with Kaku Associates. While at Caltrans, he worked in Districts 3, 4, and 7 and in the Headquarters Division of Traffic Operations.")

        val seniorStaffList : List<SeniorStaff> = listOf(tarek, bill, tom)

        // attach to senior staff adapter
        seniorStaffAdapter = SeniorStaffAdapter(seniorStaffList, this)

        // create recycler view with adapter
        senior_staff_recycler_view.layoutManager = LinearLayoutManager(this)
        senior_staff_recycler_view.adapter = seniorStaffAdapter
    }
}
