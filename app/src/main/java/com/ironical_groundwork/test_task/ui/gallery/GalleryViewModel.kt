package com.ironical_groundwork.test_task.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ironical_groundwork.test_task.R
import com.ironical_groundwork.test_task.models.GalleryList
import com.ironical_groundwork.test_task.models.PlayersList

class GalleryViewModel : ViewModel() {

    private val _basketball = MutableLiveData<List<GalleryList>>().apply {
        value = mutableListOf(
            GalleryList(1, R.drawable.basketball_1),
            GalleryList(2, R.drawable.basketball_2),
            GalleryList(3, R.drawable.basketball_3)
        )

    }
    val basketball: LiveData<List<GalleryList>> = _basketball

    private val _boxing = MutableLiveData<List<GalleryList>>().apply {
        value = mutableListOf(
            GalleryList(1, R.drawable.boxing_1),
            GalleryList(2, R.drawable.boxing_2),
            GalleryList(3, R.drawable.boxing_3)
        )

    }
    val boxing: LiveData<List<GalleryList>> = _boxing

}