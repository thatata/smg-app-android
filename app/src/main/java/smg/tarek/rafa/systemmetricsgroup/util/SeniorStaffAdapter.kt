package smg.tarek.rafa.systemmetricsgroup.util

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import smg.tarek.rafa.systemmetricsgroup.R
import smg.tarek.rafa.systemmetricsgroup.activity.SeniorStaffActivity

/**
 * Created by Tarek on 7/15/18.
 */
class SeniorStaffAdapter(private val staffMembers : List<SeniorStaff>, private val activity : Activity) : RecyclerView.Adapter<SeniorStaffAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return staffMembers.count()
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val seniorStaff = staffMembers?.get(position)

        seniorStaff?.let {
            (holder as ViewHolder).bind(seniorStaff)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)

        //inflate our score row layout
        return ViewHolder(layoutInflater.inflate(R.layout.row_seniorstaff, parent, false))
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        private val mView : View = view
        private val staffTitleText : TextView = view.findViewById<TextView>(R.id.staffTitle)
        private val staffPositionText : TextView = view.findViewById<TextView>(R.id.staffPosition)
        fun bind(seniorStaff : SeniorStaff) {
            staffTitleText.text = seniorStaff.name
            staffPositionText.text = seniorStaff.position

            // add listener to launch staff activity
            mView.setOnClickListener {
                // create intent with reference to previous activity
                val intent = Intent(activity, SeniorStaffActivity::class.java)

                // add senior staff member as an extra
                intent.putExtra("seniorStaff", seniorStaff)

                // start activity
                activity.startActivity(intent)
            }
        }
    }

}