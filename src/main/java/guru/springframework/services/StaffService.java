package guru.springframework.services;

import guru.springframework.domain.Staff;;
import guru.springframework.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;

    public List<Staff> getAllStaffs() {
        List<Staff> staffs = new ArrayList<>();
        staffRepository.findAll().forEach(staffs::add);
        return staffs;
    }

    public Optional<Staff> getStaff(Integer id) {
        return staffRepository.findById(id);
    }

    public void addStaff(Staff staff) {
        staffRepository.save(staff);
    }

    public void updateStaff(Integer id, Staff staff) {
        staffRepository.save(staff);
    }

    public void deleteStaff(Integer id) {
        staffRepository.deleteById(id);
    }
}

