package com.kotlin.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.kotlin.dto.AuthorDto
import com.kotlin.services.AuthorService
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
class AuthorControllerTest @Autowired constructor(
    private val mockMvc: MockMvc,
    @MockK val authorService: AuthorService) {

    val objectMapper = ObjectMapper()

    @Test
    fun `Test controller with 200 status code on success` (){
        mockMvc.post("/v1/authors"){
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(
                AuthorDto(
                    id = 1,
                    name = "JOhn Doe",
                    age = 30,
                    image = "author.jpg",
                    description = "description"
                )
            )
        }.andExpect {
            status { isCreated() }
        }
    }

    @Test
    fun `test that create author saves author`(){

    }
}