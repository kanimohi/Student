package guru.springframework.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "course_details")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "course_name")
    private String name;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "COURSE_FEES",
        joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "fees_id", referencedColumnName = "id"))
    private Set<Fees> fees;

    public Set<Fees> getFees() {
        return fees;
    }

    public void setFees(Set<Fees> fees) {
        this.fees = fees;
    }

    public Course() { }

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
