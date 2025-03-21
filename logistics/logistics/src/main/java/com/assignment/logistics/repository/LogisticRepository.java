package com.assignment.logistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.logistics.dto.Logisticdto;

@Repository
public interface LogisticRepository extends CrudRepository<Logisticdto, Long>{

}
