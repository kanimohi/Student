package guru.springframework.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    @JsonIgnore
    private Integer id;
    @Column(name ="addressline1")
    private String addressline1;
    @Column(name = "pincode")
    private Integer pincode;
    @Column(name = "city")
    private String city;

    public Address() { }

    public Integer getId() {
        return id;
    }

    public Address setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public Address setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
        return this;
    }

    public Integer getPincode() {
        return pincode;
    }

    public Address setPincode(Integer pincode) {
        this.pincode = pincode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }
}
