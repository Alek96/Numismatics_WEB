package com.numismatics.repository;

import com.numismatics.model.entity.Kraje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Eoller on 28-May-18.
 */
@Repository
public interface CountryRepository extends JpaRepository<Kraje, Integer> {
}
