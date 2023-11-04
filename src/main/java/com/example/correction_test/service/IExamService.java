package com.example.correction_test.service;

import com.example.correction_test.entitie.Bank;
import com.example.correction_test.entitie.Compt;
import com.example.correction_test.entitie.Transaction;
import com.example.correction_test.entitie.TypeTransaction;

import java.util.List;

public interface IExamService {
    public Bank ajouterBank(Bank bank);
    public Compt ajouterCompteEtAffecterAAgence(Compt compte, String agenceBank);
    public void getAllTransactionByDate();
    public List<Transaction> getAllTransactionByBankId(long idBank);
    public List<Transaction>
    getAllTransactionByTypeAndCompte(TypeTransaction type, long
            idCompte);
}
