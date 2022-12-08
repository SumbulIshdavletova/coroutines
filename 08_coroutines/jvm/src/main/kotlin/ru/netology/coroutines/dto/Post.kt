package ru.netology.coroutines.dto

import ru.netology.coroutines.enumeration.AttachmentType

data class Post(
    val id: Long,
    val authorId: Long,
//    val author: String,
//    val authorAvatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
)

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType,
)
