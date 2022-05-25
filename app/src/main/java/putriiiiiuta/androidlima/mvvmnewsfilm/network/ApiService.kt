package putriiiiiuta.androidlima.mvvmnewsfilm.network

import putriiiiiuta.androidlima.mvvmnewsfilm.model.GetFilmResponseItem
import putriiiiiuta.androidlima.mvvmnewsfilm.model.GetNewsResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/news")
    suspend fun getNews() : List<GetNewsResponseItem>

    @GET("/news/{id}")
    suspend fun getDetail(
        @Path("id") id : String
    ) : GetNewsResponseItem

    @GET("/film")
    suspend fun getFilm() : List<GetFilmResponseItem>
}
