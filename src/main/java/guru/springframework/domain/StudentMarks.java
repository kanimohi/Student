package guru.springframework.domain;

import javax.persistence.*;


@Entity
@Table(name = "studentmarksdetails")
public class StudentMarks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "mathematics")
    private Integer mathematics;
    @Column(name = "physics")
    private Integer physics;
    @Column(name = "chemistry")
    private Integer chemistry;


    public StudentMarks() { }

    public StudentMarks(Integer id, Integer mathematics, Integer physics, Integer chemistry) {
        this.id = id;
        this.mathematics = mathematics;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }
}
