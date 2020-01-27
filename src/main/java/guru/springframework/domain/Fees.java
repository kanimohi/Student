package guru.springframework.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "project")
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fees_id")
    @JsonIgnore
    private Integer id;
    @Column(name ="fees_heading")
    private String feesheading;
    @Column(name = "fees_amount")
    private Integer feesamount;

    public Fees(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeesheading() {
        return feesheading;
    }

    public void setFeesheading(String feesheading) {
        this.feesheading = feesheading;
    }

    public Integer getFeesamount() {
        return feesamount;
    }

    public void setFeesamount(Integer feesamount) {
        this.feesamount = feesamount;
    }


}
