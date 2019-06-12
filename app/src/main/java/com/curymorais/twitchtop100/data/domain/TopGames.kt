package com.curymorais.twitchtop100.data.domain

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class TopGames : Serializable {
    @SerializedName("_total")
    var total: Int = 0

    @SerializedName("_links")
    var links: Links? = null

    @SerializedName("top")
    var games: ArrayList<Game>? = null

}