package com.syairraputri.belajarandroid.model

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val url: String,
    val urlToImage: String,
)