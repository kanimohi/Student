package guru.springframework.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course_details")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    @JsonIgnore
    private Integer id;
    @Column(name = "course_name")
    private String name;
    public Course() { }

    public Course(Integer id, String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Course setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }
}
