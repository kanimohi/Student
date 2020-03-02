package guru.springframework.services;

import guru.springframework.domain.Attendance;
import guru.springframework.repositories.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    @Autowired
    AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendances() {
        List<Attendance> attendances = new ArrayList<>();
        attendanceRepository.findAll().forEach(attendances::add);
        return attendances;
    }

    public Optional<Attendance> getAttendance(Integer id) {
        return attendanceRepository.findById(id);
    }

    public void addAttendance(Attendance attendance) {
        attendanceRepository.save(attendance);
    }

    public void updateAttendance(Integer id, Attendance attendance) {
        attendanceRepository.save(attendance);
    }

    public void deleteAttendance(Integer id) {
        attendanceRepository.deleteById(id);
    }
}




