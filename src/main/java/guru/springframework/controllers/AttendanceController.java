package guru.springframework.controllers;

import guru.springframework.domain.Attendance;
import guru.springframework.services.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
   public class AttendanceController {
        @Autowired
        private AttendanceService attendanceService;

        @RequestMapping("/attendances")
        public List<Attendance> getAllAttendances() {
            return attendanceService.getAllAttendances();
        }

        @RequestMapping(value = "/attendances/{id}", method = RequestMethod.GET)
        public Optional<Attendance> getAttendance(@PathVariable Integer id){
            return attendanceService.getAttendance(id);
        }

        @RequestMapping(value = "/attendances", method = RequestMethod.POST)
        public ResponseEntity<Object> addAttendance(@RequestBody Attendance attendance) {
            attendanceService.addAttendance(attendance);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        @RequestMapping(value = "/attendances/{id}", method = RequestMethod.PUT)
        public Object updateAttendance(@RequestBody Attendance attendance, @PathVariable Integer id) {
            attendanceService.updateAttendance(id, attendance);
            return "Updated Successfully";
        }

        @RequestMapping(value = "/attendances/{id}", method = RequestMethod.DELETE)
        public Object deleteAttendance(@PathVariable Integer id) {

            attendanceService.deleteAttendance(id);
            return "Deleted Successfully";
        }
    }








