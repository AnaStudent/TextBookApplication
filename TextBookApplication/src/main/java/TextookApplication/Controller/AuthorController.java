package TextookApplication.Controller;

import TextookApplication.entity.Author;
import TextookApplication.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping("/create")
    public List<Author> create(@RequestBody List<Author> authors) {
        return service.saveAuthors(authors);
    }

    @GetMapping("/read/{authNumber}")
    public List<Author> findAllAuthors(){

        return service.getAuthors();
    }

    @PostMapping("/update")
    public Author update(@RequestBody Author author){

        return service.updateAuthor(author);
    }

    @DeleteMapping
    public String deleteAuthor(@PathVariable int id){
        return service.deleteAuthor(id);
    }
}
