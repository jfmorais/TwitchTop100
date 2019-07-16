package com.curymorais.twitchtop100

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.curymorais.twitchtop100.data.domain.Game
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), Contract.BaseView {


    lateinit var presenter : Contract.BasePresenter
    lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = MainAdapter()
        game_list.adapter = adapter
        game_list.setHasFixedSize(true)
        game_list.setLayoutManager( LinearLayoutManager(this));
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
        adapter.updateList(gameList!!)
        adapter.notifyDataSetChanged()
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