package guru.springframework.domain;

import javax.persistence.*;

@Entity
@Table(name = "library_details")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name ="book_Name" )
    private String bookName;
    @Column(name = "author_Name")
    private String authorName;
    private 

}
