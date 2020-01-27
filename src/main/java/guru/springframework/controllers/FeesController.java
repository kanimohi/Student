package guru.springframework.controllers;

import guru.springframework.domain.Fees;
import guru.springframework.services.FeesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FeesController {
        @Autowired
        private FeesServices feesServices;

        @RequestMapping("/feeses")
        public List<Fees> getAllfeeses() {
            return feesServices.getAllFeeses();
        }

        @RequestMapping(value = "/feeses/{id}", method = RequestMethod.GET)
        public Optional<Fees> getFees(@PathVariable Integer id){
            return feesServices.getFees(id);
        }

        @RequestMapping(value = "/feeses", method = RequestMethod.POST)
        public ResponseEntity<Object> addFees(@RequestBody Fees fees) {
            feesServices.addFeeses(fees);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        @RequestMapping(value = "/feeses/{id}", method = RequestMethod.PUT)
        public Object updateFees(@RequestBody Fees fees, @PathVariable Integer id) {
            feesServices.updateFees(id, fees);
            return "Updated Successfully";
        }

        @RequestMapping(value = "/feeses/{id}", method = RequestMethod.DELETE)
        public Object deleteFeses(@PathVariable Integer id) {

           feesServices.deleteFees(id);
            return "Deleted Successfully";
        }
    }


