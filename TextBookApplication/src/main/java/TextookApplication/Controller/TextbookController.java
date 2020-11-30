package TextookApplication.Controller;


import TextookApplication.entity.Textbook;
import TextookApplication.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TextbookController {

    @Autowired
    private TextbookService service;

    @PostMapping("/addtextbook")
    public Textbook addTextbook(@RequestBody Textbook textbook){
        return service.saveTextBook(textbook);
    }

    @GetMapping("/textbook{id}")
    public Textbook findAllTextbooks(@PathVariable Long id){
        return service.getTextbookById(id);
    }

    @PostMapping("/updatetextbook")
    public Textbook updateTextbook(@RequestBody Textbook textbook){
        return service.updateTextbook(textbook);
    }
    @DeleteMapping("/delete{id}")
    public String deleteTextbook(@PathVariable Long id){
        return service.deleteTextbook(id);
    }

}
