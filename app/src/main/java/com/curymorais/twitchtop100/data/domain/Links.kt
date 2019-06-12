package com.curymorais.twitchtop100.data.domain

import com.google.gson.annotations.SerializedName

data class Links(@SerializedName("self") var self: String,  @SerializedName("next") var next: String)