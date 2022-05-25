package putriiiiiuta.androidlima.mvvmnewsfilm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.itemfilm.view.*
import putriiiiiuta.androidlima.mvvmnewsfilm.R
import putriiiiiuta.androidlima.mvvmnewsfilm.model.GetFilmResponseItem

class FilmAdapter (
    private val listFilm: List<GetFilmResponseItem>
) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.itemfilm, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listFilm[position]

        holder.itemView.apply {
            tv_film.text = data.name
            tv_sutradara.text = data.director
            tv_tanggal.text = data.date
            this@FilmAdapter.let {
                Glide.with(holder.itemView)
                    .load(data.image)
                    .into(holder.itemView.img_film)
            }
        }
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }
}