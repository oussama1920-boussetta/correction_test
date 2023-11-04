package com.example.correction_test.repositore;

import com.example.correction_test.entitie.Transaction;
import com.example.correction_test.entitie.TypeTransaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ITransactionRepository extends CrudRepository<Transaction,Long> {
    List<Transaction> findByDateTransaction(Date date);
    @Query(value = "select t from Transaction t join Bank b on(( t.expediteur member of b.listCmpt )or( t.destinataire member of b.listCmpt)) where b.idBonk= :idBank")
    public List<Transaction> getAllTransactionByBankId(long idBank);
    public List<Transaction> findByTypeAndExpediteurIdComptOrDestinataireIdCompt(TypeTransaction type, long
            exp, long dest);
}
