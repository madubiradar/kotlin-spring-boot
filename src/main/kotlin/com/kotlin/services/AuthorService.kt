package com.kotlin.services

import com.kotlin.domain.Author
import org.springframework.stereotype.Service

@Service
interface AuthorService {

    fun save(author: Author): Author
}