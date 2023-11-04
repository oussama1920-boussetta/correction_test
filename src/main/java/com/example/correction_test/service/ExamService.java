package com.example.correction_test.service;

import com.example.correction_test.entitie.Bank;
import com.example.correction_test.entitie.Compt;
import com.example.correction_test.entitie.Transaction;
import com.example.correction_test.entitie.TypeTransaction;
import com.example.correction_test.repositore.IBankRepository;
import com.example.correction_test.repositore.ICompteRepository;
import com.example.correction_test.repositore.ITransactionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ExamService implements IExamService {
    IBankRepository bankRepository ;
    ITransactionRepository iTransactionRepository ;
    ICompteRepository compteRepository ;

    @Override
    public Bank ajouterBank(Bank bank) {
        return  bankRepository.save(bank) ;
    }

    @Override
    public Compt ajouterCompteEtAffecterAAgence(Compt compte, String agenceBank) {
        Bank bank = bankRepository.findByAgence(agenceBank) ;
        Compt cpt = compteRepository.save(compte) ;
        bank.getListCmpt().add(cpt) ;
        bankRepository.save(bank) ;
        return  cpt ;
    }

    @Override
    @Scheduled(cron = "*/30 * * * * *")
    public void getAllTransactionByDate() {

        for (Transaction t:iTransactionRepository.findByDateTransaction(new Date())
             ) {
            log.info(t.toString());
        }
    }

    @Override
    public List<Transaction> getAllTransactionByBankId(long idBank) {
        return iTransactionRepository.getAllTransactionByBankId(idBank);
    }

    @Override
    public List<Transaction> getAllTransactionByTypeAndCompte(TypeTransaction type, long idCompte) {
        return iTransactionRepository.findByTypeAndExpediteurIdComptOrDestinataireIdCompt(type,idCompte ,idCompte);
    }

}
