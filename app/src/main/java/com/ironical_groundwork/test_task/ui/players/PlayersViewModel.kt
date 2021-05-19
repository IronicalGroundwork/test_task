package com.ironical_groundwork.test_task.ui.players

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ironical_groundwork.test_task.R
import com.ironical_groundwork.test_task.models.PlayersList

class PlayersViewModel : ViewModel() {


    private val _basketball = MutableLiveData<List<PlayersList>>().apply {
        value = mutableListOf(
            PlayersList(1,R.drawable.basketball_players_1, "Майкл ДЖОРДАН", "Баскетболист"),
            PlayersList(2,R.drawable.basketball_players_2, "Карим АБДУЛ-ДЖАББАР", "Баскетболист"),
            PlayersList(3,R.drawable.basketball_players_3, "Уилт ЧЕМБЕРЛЕН", "Баскетболист"),
            PlayersList(4,R.drawable.basketball_players_4, "Тим ДАНКАН", "Баскетболист"),
            PlayersList(5,R.drawable.basketball_players_5, "Кобе БРАЙАНТ", "Баскетболист"),
            PlayersList(6,R.drawable.basketball_players_6, "Мэджик ДЖОНСОН", "Баскетболист"),
            PlayersList(7,R.drawable.basketball_players_7, "Боб КУЗИ", "Баскетболист"),
            PlayersList(8,R.drawable.basketball_players_8, "Джон СТОКТОН", "Баскетболист"),
            PlayersList(9,R.drawable.basketball_players_9, "Шакил О′НИЛ", "Баскетболист"),
            PlayersList(10,R.drawable.basketball_players_10, "Лэрри БЕРД", "Баскетболист")
        )

    }
    val basketball: LiveData<List<PlayersList>> = _basketball

    private val _boxing = MutableLiveData<List<PlayersList>>().apply {
        value = mutableListOf(
            PlayersList(1,R.drawable.boxing_players_1, "Мохаммед Али", "Боксёр"),
            PlayersList(2,R.drawable.boxing_players_2, "Шугар Рэй Робинсон", "Боксёр"),
            PlayersList(3,R.drawable.boxing_players_3, "Майк Тайсон", "Боксёр"),
            PlayersList(4,R.drawable.boxing_players_4, "Мэнни Пакьяо", "Боксёр"),
            PlayersList(5,R.drawable.boxing_players_5, "Рокки Марчиано", "Боксёр"),
            PlayersList(6,R.drawable.boxing_players_6, "Джо Луис", "Боксёр"),
            PlayersList(7,R.drawable.boxing_players_7, "Рой Джонс-младший", "Боксёр"),
            PlayersList(8,R.drawable.boxing_players_8, "Джордж Форман", "Боксёр"),
            PlayersList(9,R.drawable.boxing_players_9, "Шугар Рэй Леонард", "Боксёр"),
            PlayersList(10,R.drawable.boxing_players_10, "Флойд Мейвезер", "Боксёр")
        )

    }
    val boxing: LiveData<List<PlayersList>> = _boxing


}