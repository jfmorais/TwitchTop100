package com.curymorais.twitchtop100.data.domain

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class GameDetail(@SerializedName("name") var name: String,
                      @SerializedName("_id") var id: Int,
                      @SerializedName("giantbomb_id") var giantbombId: Int,
                      @SerializedName("box") var boxImages: Box,
                      @SerializedName("logo") var logoImages: Logo,
                      @SerializedName("_links") var links: Links,
                      @SerializedName("localized_name") var localizedName: String,
                      @SerializedName("locale") var locale: String,
                      @SerializedName("popularity") var popularity: Int): Serializable