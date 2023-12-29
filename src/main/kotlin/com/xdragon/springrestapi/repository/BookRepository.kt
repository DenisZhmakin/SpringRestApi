package com.xdragon.springrestapi.repository

import com.xdragon.springrestapi.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<Book, Long>