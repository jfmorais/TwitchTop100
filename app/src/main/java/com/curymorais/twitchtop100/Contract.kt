package com.curymorais.twitchtop100

import com.curymorais.twitchtop100.data.domain.Game

interface Contract {

    interface BaseView {
        fun initComponents()
        fun setupComponentsListeners()
        fun updateData()
        fun updateView(gameList : ArrayList<Game>?)
        fun getDataSuccess()
        fun getDataFail(msg: String?)
        fun showProgress()
        fun hideProgress()
    }

    interface BasePresenter {
        fun getData()
    }

    interface BaseInteractor {

        interface OnFinishedListener {
            //            void onFinished(ArrayList<Notice> noticeArrayList);
            fun onSuccess(gameArrayList: ArrayList<Game>?)

            fun onFailure(t: Throwable)
        }

        fun getGameArrayList(onFinishedListener: OnFinishedListener)
    }
}