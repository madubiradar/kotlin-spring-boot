package com.kotlin.dto

import com.kotlin.domain.Author

data class AuthorDto(
    val id: Long?,
    val name: String?,
    val age: Int,
    val description: String?,
    val image: String?
) {
    fun Author.toAuthorDto(): AuthorDto {
        return AuthorDto (
            id = this.id,
            name = this.name,
            age = this.age,
            description = this.description,
            image = this.image
        )
    }
}