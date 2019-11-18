package com.agilecodeconsult.service

import javax.inject.Singleton

interface FruitService {
    fun taste(): String
}

@Singleton
class FruitServiceImpl : FruitService {
    override fun taste(): String {
        return "apples"
    }
}
