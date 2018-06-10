package com.numismatics.service;

import com.numismatics.model.entity.Certyfikaty;
import com.numismatics.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {
    @Autowired
    private CertificateRepository certRepository;

    public CertificateService() {
        super();
    }

    public List<Certyfikaty> findAll() {
        return this.certRepository.findAll();
    }

    public Certyfikaty findById(final Integer id) {
        return this.certRepository.findById(id).get();
    }

    public void add(final Certyfikaty cert) {
        this.certRepository.save(cert);
    }
}
