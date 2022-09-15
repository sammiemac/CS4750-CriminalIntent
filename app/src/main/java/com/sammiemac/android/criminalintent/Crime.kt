package com.sammiemac.android.criminalintent

import java.util.*

// Listing 8.1: Adding the Crime data class
data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = " ",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)