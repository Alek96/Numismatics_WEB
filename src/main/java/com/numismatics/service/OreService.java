package com.numismatics.service;

import com.numismatics.model.entity.Kruszce;
import com.numismatics.repository.OreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OreService {
    @Autowired
    private OreRepository oreRepository;

    public OreService() {
        super();
    }

    public List<Kruszce> findAll() {
        return this.oreRepository.findAll();
    }

    public Kruszce findById(final Integer id) {
        return this.oreRepository.findById(id).get();
    }

    public void add(final Kruszce ore) {
        this.oreRepository.save(ore);
    }
}
