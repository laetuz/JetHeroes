package com.neotica.jetheroes.di

import com.neotica.jetheroes.data.HeroRepository
import com.neotica.jetheroes.data.HeroViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModel = module {
    viewModel { HeroViewModel(get()) }
    single { HeroRepository() }
}