package com.curymorais.twitchtop100

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.curymorais.twitchtop100.data.domain.Game

class MainActivity : AppCompatActivity(), Contract.BaseView {


    lateinit var presenter : Contract.BasePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this, Interactor())
        updateData()
    }

    override fun initComponents() {
    }

    override fun setupComponentsListeners() {
    }

    override fun updateData() {
        presenter.getData()
    }

    override fun updateView(gameList : ArrayList<Game>?){

    }

    override fun getDataSuccess() {
    }

    override fun getDataFail(msg: String?) {
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }
}