package com.syairraputri.belajarandroid.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.syairraputri.belajarandroid.model.Article
import com.syairraputri.belajarandroid.network.Api
import kotlinx.coroutines.launch

class NewsViewModel: ViewModel() {

    init {
        getListNews()
    }

    fun getListNews() {
        viewModelScope.launch {
            val response = Api.newsAPIService.getTopHeadline()
            val articles = response.articles

            response.articles.forEach{ article:Article ->
                Log.d("response", article.toString())
            }
        }
    }
}