package TextookApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Textbook {

    @Id
    @GeneratedValue
    private Long bookId;
    private String bookName;
    private String bookDescription;
    private String bookISBN;
    private float price;


}
