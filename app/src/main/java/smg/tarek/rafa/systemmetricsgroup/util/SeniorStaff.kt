package smg.tarek.rafa.systemmetricsgroup.util

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Tarek on 7/15/18.
 */
@Parcelize
data class SeniorStaff(val name : String, val position : String, val bio : String) : Parcelable