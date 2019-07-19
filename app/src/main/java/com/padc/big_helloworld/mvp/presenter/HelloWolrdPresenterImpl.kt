package com.padc.big_helloworld.mvp.presenter

import com.padc.big_helloworld.behaviour.HelloWorldTextBehaviour
import com.padc.big_helloworld.mvp.model.HelloWorldModel
import com.padc.big_helloworld.mvp.model.HelloWorldModelImpl
import com.padc.big_helloworld.mvp.view.HelloWorldView

class HelloWolrdPresenterImpl : HelloWorldPresenter {
    val hellworldModel: HelloWorldModelImpl

    init {
        hellworldModel = HelloWorldModelImpl
    }

    lateinit var view: HelloWorldView
    fun initView(view: HelloWorldView) {
        this.view = view
    }

    override fun onUiReady() {
        hellworldModel.setBehaviour(HelloWorldTextBehaviour())
        val text = hellworldModel.getHelloWorld()
        view.showHelloWorld(text)
    }
}