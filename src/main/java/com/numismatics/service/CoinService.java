package com.numismatics.service;

import com.numismatics.model.entity.Monety;
import com.numismatics.repository.MonetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinService {

    @Autowired
    private MonetRepository coinRepository;

    public List<Monety> findAll() {
        return this.coinRepository.findAll();
    }

    public Monety findById(final Integer id) {
        return this.coinRepository.findById(id).get();  // Optional<Monety> !! orElse(..) ?
    }
}
