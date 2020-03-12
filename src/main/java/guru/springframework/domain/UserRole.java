package guru.springframework.domain;

import javax.persistence.*;

@Entity
@Table(name = "role_details")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "rolename")
    private String roleName;

    public UserRole(){}
    public  UserRole(Integer id,String roleName){
        this.id = id;
        this.roleName = roleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
