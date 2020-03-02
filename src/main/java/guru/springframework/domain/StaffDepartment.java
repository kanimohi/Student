package guru.springframework.domain;

import javax.persistence.*;

@Entity
@Table(name = "staff_department")
public class StaffDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "dept_name")
    private String departmentName;
    public StaffDepartment(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
