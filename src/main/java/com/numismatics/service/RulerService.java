package com.numismatics.service;

import com.numismatics.model.entity.Panujacy;
import com.numismatics.repository.RulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RulerService {
    @Autowired
    private RulerRepository rulerRepository;

    public RulerService() {
        super();
    }

    public List<Panujacy> findAll() {
        return this.rulerRepository.findAll();
    }

    public Panujacy findById(final Integer id) {
        return this.rulerRepository.findById(id).get();
    }

    public void add(final Panujacy ruler) {
        this.rulerRepository.save(ruler);
    }
}
