package TextookApplication.service;

import TextookApplication.entity.Author;
import TextookApplication.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repository;

    public List<Author> saveAuthors(List<Author> authors){
        return repository.saveAll(authors);
    }

    public List<Author> getAuthors(){
        return repository.findAll();
    }
    public String deleteAuthor(int id){
        repository.deleteById(id);
        return "author removed"+ id;
    }
    public Author updateAuthor(Author author){
        return this.repository.save(author);
    }

}
