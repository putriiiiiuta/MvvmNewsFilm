package putriiiiiuta.androidlima.mvvmnewsfilm.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import putriiiiiuta.androidlima.mvvmnewsfilm.model.GetFilmResponseItem
import putriiiiiuta.androidlima.mvvmnewsfilm.network.ApiService
import javax.inject.Inject

@HiltViewModel
class FilmApiViewModel @Inject constructor(private val apiService: ApiService) : ViewModel() {
    val listFilm = MutableLiveData<List<GetFilmResponseItem>>()
    val film : LiveData<List<GetFilmResponseItem>> = listFilm

    init {
        viewModelScope.launch {
            delay(2000)
            listFilm.value = apiService.getFilm()
        }
    }
}