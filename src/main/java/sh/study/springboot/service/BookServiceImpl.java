package sh.study.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import sh.study.springboot.domain.Book;
import sh.study.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private final BookRepository BookRepository;
		
	public BookServiceImpl(sh.study.springboot.domain.BookRepository bookRepository) {
			this.BookRepository = bookRepository;
	}

    @Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return BookRepository.findById(id);
	}

}
