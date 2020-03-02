package guru.springframework.domain;

import javax.persistence.*;

@Entity
@Table(name = "library_details")
public class LibraryBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name ="book_Name" )
    private String bookName;
    @Column(name = "author_Name")
    private String authorName;
    @Column(name = "issue_Date")
    private String issueDate;
    @Column(name = "return_Date")
    private String returnDate;

    public LibraryBook(){}

    public LibraryBook(Integer id, String bookName, String authorName, String issueDate, String returnDate){
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
