package com.kotlin.domain

import jakarta.persistence.*

@Entity
@Table(name = "authors")
data class Author (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    val id: Long? = null,
    val name: String? = null,
    val age: Int = 0,
    val description: String? = null,
    val image: String? = null
)