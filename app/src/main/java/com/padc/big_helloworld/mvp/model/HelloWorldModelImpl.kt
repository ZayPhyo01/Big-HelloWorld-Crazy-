package com.padc.big_helloworld.mvp.model

import com.padc.big_helloworld.behaviour.ShowTextBehaviour

object HelloWorldModelImpl : HelloWorldModel {

    lateinit var showTextBehaviour: ShowTextBehaviour

    override fun getHelloWorld(): String {
        return showTextBehaviour.makeText()
    }

    fun setBehaviour(showTextBehaviour: ShowTextBehaviour) {
        this.showTextBehaviour = showTextBehaviour
    }
}