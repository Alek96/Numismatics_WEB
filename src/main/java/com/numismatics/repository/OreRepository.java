package com.numismatics.repository;

import com.numismatics.model.entity.Kruszce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OreRepository extends JpaRepository<Kruszce, Integer> {
}
