package com.numismatics.service;

import com.numismatics.model.entity.Mennice;
import com.numismatics.repository.MintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MintService {
    @Autowired
    private MintRepository repository;

    public MintService() {
        super();
    }

    public List<Mennice> findAll() {
        return this.repository.findAll();
    }

    public Mennice findById(final Integer id) {
        return this.repository.findById(id).get();
    }

    public void add(final Mennice mint) {
        this.repository.save(mint);
    }
}
