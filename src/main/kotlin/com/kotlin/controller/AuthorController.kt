package com.kotlin.controller

import com.kotlin.dto.AuthorDto
import com.kotlin.services.AuthorService
import com.kotlin.toAuthor
import com.kotlin.toAuthorDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class AuthorController (private val authorService: AuthorService){

    @PostMapping(path = ["/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto> {
        val createdAuthor = authorService.save(authorDto.toAuthor(authorDto)).toAuthorDto()
        return ResponseEntity(createdAuthor, HttpStatus.CREATED)
    }
}