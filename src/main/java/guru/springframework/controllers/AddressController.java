package guru.springframework.controllers;

import guru.springframework.domain.Address;
import guru.springframework.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    private AddressServices addressServices;

    @RequestMapping("/addresses")
    public List<Address> getAllAddresses() {
        return addressServices.getAllAddresses();
    }

    @RequestMapping(value = "/addresses/{id}", method = RequestMethod.GET)
    public Optional<Address> getAddress(@PathVariable Integer id){
        return addressServices.getAddress(id);
    }

    @RequestMapping(value = "/addresses", method = RequestMethod.POST)
    public ResponseEntity<Object> addAddress(@RequestBody Address address) {
        addressServices.addAddress(address);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/addresses/{id}", method = RequestMethod.PUT)
    public Object updateAddress(@RequestBody Address address, @PathVariable Integer id) {
        addressServices.updateAddress(id, address);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/addresses/{id}", method = RequestMethod.DELETE)
    public Object deleteAddresses(@PathVariable Integer id) {

        addressServices.deleteAddress(id);
        return "Deleted Successfully";
    }
}
