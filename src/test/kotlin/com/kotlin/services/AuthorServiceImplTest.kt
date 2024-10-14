package com.kotlin.services

import com.kotlin.domain.Author
import com.kotlin.dto.AuthorDto
import com.kotlin.impl.AuthorServiceImpl
import com.kotlin.repositories.AuthorRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.findByIdOrNull

@SpringBootTest
class AuthorServiceImplTest @Autowired constructor(
    private val underTest: AuthorServiceImpl,
    private val authorRepository: AuthorRepository
){


    @Test
    fun `test that save persists author in database`(){
        val savedAuthor = underTest.save( Author(
            id = 1,
            name = "John Doe",
            age = 30,
            image = "author.jpg",
            description = "description"
        )
        )

        Assertions.assertNotNull(savedAuthor.id)

        val repoAuthor = authorRepository.findByIdOrNull(savedAuthor.id!!)
        Assertions.assertNotNull(repoAuthor)
        Assertions.assertAll(
            { Assertions.assertNotNull(repoAuthor) },  // Check that the author exists
            { Assertions.assertEquals("John Doe", repoAuthor?.name) },  // Check the name
            { Assertions.assertEquals(30, repoAuthor?.age) },  // Check the age
            { Assertions.assertEquals("author.jpg", repoAuthor?.image) },  // Check the image
            { Assertions.assertEquals("description", repoAuthor?.description) }  // Check the description
        )
    }
}