package com.xdragon.springrestapi.entity

import jakarta.persistence.*

@Entity
data class Book(
    @Id
    @GeneratedValue
    val id: Long,
    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    val author: String
)
