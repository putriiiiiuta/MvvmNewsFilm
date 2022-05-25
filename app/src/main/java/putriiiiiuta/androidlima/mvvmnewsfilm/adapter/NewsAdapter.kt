package putriiiiiuta.androidlima.mvvmnewsfilm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.view.*
import putriiiiiuta.androidlima.mvvmnewsfilm.R
import putriiiiiuta.androidlima.mvvmnewsfilm.model.GetNewsResponseItem

class NewsAdapter (private var listNews : List<GetNewsResponseItem>, val onItemClick: (GetNewsResponseItem) -> Unit) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.itemnews, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listNews[position]

        holder.itemView.apply {
            tv_news.text = data.title
            tv_author.text = data.author
            tv_tanggal.text = data.createdAt
            rootView.setOnClickListener {
                onItemClick(data)
            }
            this@NewsAdapter.let {
                Glide.with(holder.itemView)
                    .load(data.image)
                    .into(holder.itemView.img_news)
            }
        }
    }

    override fun getItemCount(): Int {
        return listNews.size
    }


}