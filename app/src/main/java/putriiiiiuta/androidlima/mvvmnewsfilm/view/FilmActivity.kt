package putriiiiiuta.androidlima.mvvmnewsfilm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_film.*
import putriiiiiuta.androidlima.mvvmnewsfilm.R
import putriiiiiuta.androidlima.mvvmnewsfilm.adapter.FilmAdapter
import putriiiiiuta.androidlima.mvvmnewsfilm.vm.FilmApiViewModel

@AndroidEntryPoint
class FilmActivity : AppCompatActivity() {

    private val viewModel : FilmApiViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film)
        viewModel.film.observe(this){
            rv_film.layoutManager = LinearLayoutManager(this)
            rv_film.adapter = FilmAdapter(it)
        }
    }
}