package guru.springframework.services;

import guru.springframework.domain.LibraryBook;
import guru.springframework.domain.Staff;
import guru.springframework.repositories.LibraryBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryBookService {
    @Autowired
    LibraryBookRepository libraryBookRepository;

    public List<LibraryBook> getAllLibraryBooks() {
        List<LibraryBook> libraryBooks = new ArrayList<>();
        libraryBookRepository.findAll().forEach(libraryBooks::add);
        return libraryBooks;
    }

    public Optional<LibraryBook> getLibraryBook(Integer id) {
        return libraryBookRepository.findById(id);
    }

    public void addLibraryBook(LibraryBook libraryBook) {
        libraryBookRepository.save(libraryBook);
    }

    public void updateLibraryBook(Integer id, LibraryBook libraryBook) {
        libraryBookRepository.save(libraryBook);
    }

    public void deleteLibraryBook(Integer id) {
        libraryBookRepository.deleteById(id);
    }
}
