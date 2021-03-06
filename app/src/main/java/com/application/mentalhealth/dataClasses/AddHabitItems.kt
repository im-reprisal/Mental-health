package com.application.mentalhealth.dataClasses

import android.widget.ImageView
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "habitTable")
data class AddHabitItems(@ColumnInfo(name = "habitName") var habitName:String,
                         @ColumnInfo(name = "habitTime") var habitTime:String){
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id:Int?=null
}
