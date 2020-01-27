package guru.springframework.services;

import guru.springframework.domain.Fees;
import guru.springframework.repositories.FeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FeesServices {
    @Autowired
    FeesRepository feesRepository;

        public List<Fees> getAllFeeses() {
            List<Fees> fees = new ArrayList<>();
            feesRepository.findAll().forEach(fees::add);
            return fees;
        }

        public Optional<Fees> getFees(Integer id) {
            return feesRepository.findById(id);
        }

        public void addFeeses(Fees fees) {
            feesRepository.save(fees);
        }

        public void updateFees(Integer id, Fees fees) {
            feesRepository.save(fees);
        }

        public void deleteFees(Integer id) {
            feesRepository.deleteById(id);
        }
    }


