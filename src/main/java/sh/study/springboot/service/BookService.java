package sh.study.springboot.service;

import java.util.Optional;

import sh.study.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long id);
}
