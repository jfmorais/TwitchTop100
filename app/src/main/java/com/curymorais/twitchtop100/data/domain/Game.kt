package com.curymorais.twitchtop100.data.domain

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Game(@SerializedName("viewers") var viewers: Int,
           @SerializedName("channels") var channels: Int,
           @SerializedName("game") var gameDetail: GameDetail
) : Serializable