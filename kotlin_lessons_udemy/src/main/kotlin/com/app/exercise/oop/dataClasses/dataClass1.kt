package com.app.exercise.oop.dataClasses

import kotlin.random.Random

fun main(args: Array<String>) {
    val articles = arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())

    val newArticles = arrayListOf<Article>()
    newArticles.addAll(articles)

    for(article in articles) {
        val newArticle = article.copy(title = article.title + " for my blog")
        newArticles.add(newArticle)
    }

    newArticles.forEach { println(it) }
}

fun getArticle(): Article {
    val randomTitle = "Title : " + Random.nextInt(100)
    val numberOfReaders = Random.nextInt(1000)
    return Article(randomTitle, "Some Content", numberOfReaders)
}

data class Article(
        val title: String,
        val content: String,
        val numberOfReaders: Int
)