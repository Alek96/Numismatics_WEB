package com.numismatics.repository;

import com.numismatics.model.entity.FirmyCertyfikujace;
import com.numismatics.model.entity.TypyKrajow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Eoller on 28-May-18.
 */
@Repository
public interface CountryTypeRepository extends JpaRepository<TypyKrajow, Integer> {
}
