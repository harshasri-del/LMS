package com.book.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.book.entities.Books;

public interface BookDao extends JpaRepository<Books, Long>{

}
