package com.neotica.jetheroes.data

import com.neotica.jetheroes.model.Hero
import com.neotica.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}