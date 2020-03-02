package guru.springframework.domain;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "present_days")
    private Integer presentDays;
    @Column(name = "absent_days")
    private Integer absentDays;
    public Attendance(){}

    public Attendance(Integer id, Integer presentDays, Integer absentDays){
        this.id = id;
        this.presentDays = presentDays;
        this.absentDays = absentDays;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPresentDays() {
        return presentDays;
    }

    public void setPresentDays(Integer presentDays) {
        this.presentDays = presentDays;
    }

    public Integer getAbsentDays() {
        return absentDays;
    }

    public void setAbsentDays(Integer absentDays) {
        this.absentDays = absentDays;
    }

}

