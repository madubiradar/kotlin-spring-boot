package com.kotlin.repositories

import com.kotlin.domain.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<Author, Long> {
}