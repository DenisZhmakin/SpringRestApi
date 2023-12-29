package com.xdragon.springrestapi.controller

import com.xdragon.springrestapi.entity.Book
import com.xdragon.springrestapi.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/books")
class BookController {
    @Autowired
    private lateinit var bookRepository: BookRepository

    @GetMapping
    fun getBooks(): List<Book> {
        return bookRepository.findAll()
    }
    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: Long): Optional<Book> {
        return bookRepository.findById(id)
    }
    @PostMapping
    fun addBook(@RequestBody book: Book): Book {
        return bookRepository.save(book)
    }

    @PutMapping
    fun updateBook(@RequestBody book: Book) {
        bookRepository.save(book)
    }
}