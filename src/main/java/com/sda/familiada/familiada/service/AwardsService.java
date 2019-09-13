package com.sda.familiada.familiada.service;

import com.sda.familiada.familiada.repository.AwardsRepository;
import org.springframework.stereotype.Service;

@Service
public class AwardsService {

    private final AwardsRepository awardsRepository;

    public AwardsService(AwardsRepository awardsRepository) {
        this.awardsRepository = awardsRepository;
    }
}
