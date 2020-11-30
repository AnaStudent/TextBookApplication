package TextookApplication.service;

import TextookApplication.entity.Textbook;
import TextookApplication.repository.TextbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextbookService {

    @Autowired
    private TextbookRepository repository;

    public Textbook saveTextBook(Textbook textbook){
       return repository.save(textbook);
    }
    public List<Textbook> saveTextBook(List<Textbook> textbooks){
        return repository.saveAll(textbooks);
    }
    public Textbook getTextbookById(Long id){
        return repository.findById(id).orElse(null);
    }
    public String deleteTextbook(Long id){
        repository.deleteById(id);
        return "Textbook Removed "+ id;
    }
    public Textbook updateTextbook(Textbook textbook){
        if (this.repository.existsById(textbook.getBookId())) {
            return this.repository.save(textbook);
        }
        else {
            return null;
        }
    }

}
