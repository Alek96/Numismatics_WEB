package com.numismatics.service;

import com.numismatics.model.entity.Kraje;
import com.numismatics.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Kraje> findAll() {
        return this.countryRepository.findAll();
    }

    public Kraje findById(final Integer id) {
        return this.countryRepository.findById(id).get();
    }

    public void add(final Kraje country) {
        this.countryRepository.save(country);
    }
}