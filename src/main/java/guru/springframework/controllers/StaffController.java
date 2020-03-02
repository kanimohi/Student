package guru.springframework.controllers;

import guru.springframework.domain.Staff;
import guru.springframework.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("/staffs")
    public List<Staff> getAllStaffs() {
        return staffService.getAllStaffs();
    }

    @RequestMapping(value = "/staffs/{id}", method = RequestMethod.GET)
    public Optional<Staff> getStaff(@PathVariable Integer id){
        return staffService.getStaff(id);
    }

    @RequestMapping(value = "/staffs", method = RequestMethod.POST)
    public ResponseEntity<Object> addStaff(@RequestBody Staff staff) {
        staffService.addStaff(staff);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/staffs/{id}", method = RequestMethod.PUT)
    public Object updateStaff(@RequestBody Staff staff, @PathVariable Integer id) {
        staffService.updateStaff(id, staff);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/staffs/{id}", method = RequestMethod.DELETE)
    public Object deleteStaff(@PathVariable Integer id) {

        staffService.deleteStaff(id);
        return "Deleted Successfully";
    }
}










