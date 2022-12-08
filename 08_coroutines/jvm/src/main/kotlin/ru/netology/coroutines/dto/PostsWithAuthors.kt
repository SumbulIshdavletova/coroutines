package ru.netology.coroutines.dto

data class PostsWithAuthors(
    val post: Post,
    val author: Author,
)
