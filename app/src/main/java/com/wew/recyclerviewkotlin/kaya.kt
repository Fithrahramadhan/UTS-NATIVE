package com.wew.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class kaya(
    val imgKaya: Int,
    val nameKaya: String,
    val descKaya: String
) : Parcelable
