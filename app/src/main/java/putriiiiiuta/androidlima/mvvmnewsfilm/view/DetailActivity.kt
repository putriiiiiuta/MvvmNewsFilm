package putriiiiiuta.androidlima.mvvmnewsfilm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import putriiiiiuta.androidlima.mvvmnewsfilm.R
import putriiiiiuta.androidlima.mvvmnewsfilm.model.GetNewsResponseItem

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailNews = intent.getParcelableExtra<GetNewsResponseItem>("detail") as GetNewsResponseItem

        tv_news.text = detailNews.title
        tv_author.text = detailNews.author
        tv_tanggal.text = detailNews.createdAt
        tv_description.text = detailNews.description
        Glide.with(this).load(detailNews.image).into(img_news)
        
    }
}