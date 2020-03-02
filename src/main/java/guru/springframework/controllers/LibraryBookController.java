package guru.springframework.controllers;

import guru.springframework.domain.LibraryBook;
import guru.springframework.domain.Staff;
import guru.springframework.services.LibraryBookService;
import guru.springframework.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibraryBookController {
    @Autowired
    private LibraryBookService libraryBookService;

    @RequestMapping("/books")
    public List<LibraryBook> getAllLibraryBooks() {
        return libraryBookService.getAllLibraryBooks();
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public Optional<LibraryBook> getLibraryBook(@PathVariable Integer id){
        return libraryBookService.getLibraryBook(id);
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public ResponseEntity<Object> addLibraryBook(@RequestBody LibraryBook libraryBook) {
        libraryBookService.addLibraryBook(libraryBook);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
    public Object updateLibraryBook(@RequestBody LibraryBook libraryBook, @PathVariable Integer id) {
        libraryBookService.updateLibraryBook(id, libraryBook);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    public Object deleteLibraryBook(@PathVariable Integer id) {
        libraryBookService.deleteLibraryBook(id);
        return "Deleted Successfully";
    }
}
