package com.klef.jfsd.exam.labexam.Repository;

import com.klef.jfsd.exam.labexam.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}