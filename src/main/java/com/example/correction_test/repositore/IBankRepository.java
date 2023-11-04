package com.example.correction_test.repositore;

import com.example.correction_test.entitie.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBankRepository extends CrudRepository<Bank,Long> {

Bank findByAgence(String x) ;
}
