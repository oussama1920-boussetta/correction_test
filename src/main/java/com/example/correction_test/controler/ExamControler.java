package com.example.correction_test.controler;

import com.example.correction_test.entitie.Bank;
import com.example.correction_test.entitie.Compt;
import com.example.correction_test.entitie.Transaction;
import com.example.correction_test.entitie.TypeTransaction;
import com.example.correction_test.service.IExamService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@AllArgsConstructor
@Slf4j
public class ExamControler {
    private IExamService service;

    @PostMapping ("addBank")
    public Bank ajouterBank (@RequestBody Bank bank)
    {
        return service.ajouterBank(bank);
    }
    @PostMapping("addCompte")
    public Compt ajouterCompteEtAffecterAAgence(@RequestBody Compt cpt ,@RequestParam ("agence") String agence)
    {
        return service.ajouterCompteEtAffecterAAgence(cpt,agence) ;

    }
    @GetMapping("get-trans-by-id")
    public List<Transaction> getAllTransactionByBankId(@RequestParam ("idBank") Long idBank)
    {
        return service.getAllTransactionByBankId(idBank) ;

    }
    @GetMapping("get-trans-by-type-and-id")
    public List<Transaction> getAllTransactionByTypeAndCompte(@RequestParam ("idCompte") Long idCompte, @RequestParam ("type")TypeTransaction type)
    {
        return service.getAllTransactionByTypeAndCompte(type,idCompte) ;

    }
}
