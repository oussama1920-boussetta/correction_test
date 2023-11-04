package com.example.correction_test.repositore;

import com.example.correction_test.entitie.Compt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompteRepository extends CrudRepository<Compt,Long> {
}
