package com.padc.big_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.big_helloworld.mvp.presenter.HelloWolrdPresenterImpl
import com.padc.big_helloworld.mvp.presenter.HelloWorldPresenter
import com.padc.big_helloworld.mvp.view.HelloWorldView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HelloWorldView {
    override fun showHelloWorld(s: String) {
        helloworld.text = s
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = HelloWolrdPresenterImpl()
        presenter.initView(this)
        presenter.onUiReady()
    }
}
