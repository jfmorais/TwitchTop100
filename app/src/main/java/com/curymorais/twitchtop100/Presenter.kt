package com.curymorais.twitchtop100

import com.curymorais.twitchtop100.data.domain.Game

class Presenter (view : Contract.BaseView?, interactor: Interactor) : Contract.BasePresenter, Contract.BaseInteractor.OnFinishedListener {

    var mView: Contract.BaseView? = view
//        get(): Contract.BaseView {
//            return mView
//        }
//        set(newView){
//            mView = newView
//        }

    var mInteractor = interactor

    override fun getData() {
        mView?.showProgress()
        mInteractor.getGameArrayList(this)
    }

    override fun onSuccess(gameArrayList: ArrayList<Game>?) {
        mView?.hideProgress()
        mView?.updateView(gameArrayList)

    }

    override fun onFailure(t: Throwable) {
        mView?.hideProgress()
        mView?.getDataFail(t.message)
    }

    fun onDestroy() {
        mView = null
    }

//    fun onItemClick(adapterPosition: Int) {
////        mView?.onItemClick(adapterPosition) TODO
//    }
}