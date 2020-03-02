package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "fees_details")
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name ="fees_heading")
    private String feesHeading;
    @Column(name = "fees_amount")
    private Integer feesAmount;

    @ManyToMany(mappedBy = "fees")
    private Set<Course> courses;

    public Fees(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeesHeading() {
        return feesHeading;
    }

    public void setFeesHeading(String feesHeading) {
        this.feesHeading = feesHeading;
    }

    public Integer getFeesAmount() {
        return feesAmount;
    }

    public void setFeesamount(Integer feesAmount) {
        this.feesAmount = feesAmount;
    }


}
