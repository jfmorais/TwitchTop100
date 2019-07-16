package com.curymorais.twitchtop100

import android.util.Log
import com.curymorais.twitchtop100.data.domain.TopGames
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Interactor : Contract.BaseInteractor {

    override fun getGameArrayList(onFinishedListener: Contract.BaseInteractor.OnFinishedListener) {
        var call = RetrofitInitializer().twitchService().getTop100Games()

        call.enqueue(object: Callback<TopGames> {
            override fun onResponse(call: Call<TopGames>, response: Response<TopGames>) {
                onFinishedListener.onSuccess(response.body()?.games)
            }

            override fun onFailure(call: Call<TopGames>, t: Throwable) {
                onFinishedListener.onFailure(t)
            }
        })
    }
}