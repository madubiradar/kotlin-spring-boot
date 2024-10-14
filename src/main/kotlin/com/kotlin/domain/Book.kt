package com.kotlin.domain

import jakarta.persistence.*

@Entity
@Table(name = "Books")
class Book (

    @Id
    val isbn: String,
    val title: String?,
    val description: String?,
    val image: String?,

    @ManyToOne(cascade = [CascadeType.DETACH])
    @JoinColumn(name = "author_id")
    val author: Author
)
