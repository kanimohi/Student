package guru.springframework.services;

import guru.springframework.domain.Address;
import guru.springframework.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressServices {
    @Autowired
    AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        List<Address> addresses = new ArrayList<>();
       addressRepository.findAll().forEach(addresses::add);
        return addresses;
    }

    public Optional<Address> getAddress(Integer id) {
        return addressRepository.findById(id);
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void updateAddress(Integer id, Address address) {
        addressRepository.save(address);
    }

    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }
}

