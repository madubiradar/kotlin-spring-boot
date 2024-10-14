package com.kotlin

import com.kotlin.domain.Author
import com.kotlin.dto.AuthorDto

fun Author.toAuthorDto(): AuthorDto {
    return AuthorDto (
        id = this.id,
        name = this.name,
        age = this.age,
        description = this.description,
        image = this.image
    )
}


fun AuthorDto.toAuthor(authorDto: AuthorDto): Author {
    return Author (
        id= this.id,
        name = this.name,
        age = this.age,
        description = this.description,
        image = this.image
    )
}
