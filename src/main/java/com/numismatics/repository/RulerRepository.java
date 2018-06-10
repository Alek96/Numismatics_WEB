package com.numismatics.repository;

import com.numismatics.model.entity.Panujacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulerRepository extends JpaRepository<Panujacy, Integer> {
}
