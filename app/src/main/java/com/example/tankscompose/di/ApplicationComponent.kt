package com.example.tankscompose.di

import com.example.tankscompose.ui.claninfo.ClanInfoFragment
import com.example.tankscompose.ui.clanslist.ClanListFragment
import com.example.tankscompose.ui.playerinfo.PlayerInfoFragment
import com.example.tankscompose.ui.playerslist.PlayerListFragment
import dagger.Component

@Component(modules = [
    NetworkModule::class,
    ViewModelsModule::class
])
interface ApplicationComponent {

    fun inject(playerListFragment: PlayerListFragment)

    fun inject(clanListFragment: ClanListFragment)

    fun inject(playerInfoFragment: PlayerInfoFragment)

    fun inject(clanInfoFragment: ClanInfoFragment)
}