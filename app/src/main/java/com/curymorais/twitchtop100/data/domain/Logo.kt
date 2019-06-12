package com.curymorais.twitchtop100.data.domain

import com.google.gson.annotations.SerializedName

data class Logo (@SerializedName("large") var large: String,
                 @SerializedName("medium") var medium: String,
                 @SerializedName("small") var small: String,
                 @SerializedName("template") var template: String)