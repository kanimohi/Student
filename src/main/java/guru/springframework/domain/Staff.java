package guru.springframework.domain;

import javax.persistence.*;

@Entity
@Table(name = "staff_details")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "staff_name")
    private String staffName;
    @Column(name = "qualification")
    private String qualification;

    @ManyToOne
    private StaffDepartment staffDepartment;

    public StaffDepartment getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(StaffDepartment staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public Staff(){}

    public Staff(Integer id,String staffName,String qualification){
        this.id = id;
        this.staffName = staffName;
        this.qualification = qualification;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
