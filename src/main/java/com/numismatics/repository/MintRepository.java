package com.numismatics.repository;

import com.numismatics.model.entity.Mennice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MintRepository extends JpaRepository<Mennice, Integer> {
}
