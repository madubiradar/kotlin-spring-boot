package com.kotlin.impl

import com.kotlin.domain.Author
import com.kotlin.repositories.AuthorRepository
import com.kotlin.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl (private val authorRepository: AuthorRepository) : AuthorService {
    override fun save(author: Author): Author {
       return authorRepository.save(author)
    }
}