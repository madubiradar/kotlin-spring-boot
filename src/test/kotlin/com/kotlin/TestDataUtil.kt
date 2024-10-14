package com.kotlin

import com.kotlin.dto.AuthorDto

fun testAuthorDto(id: Long? = null) : AuthorDto{
    return AuthorDto(
        id = id,
        name = "john Doe",
        age = 30,
        description = "some desc",
        image = "author.jpg"
    )
}