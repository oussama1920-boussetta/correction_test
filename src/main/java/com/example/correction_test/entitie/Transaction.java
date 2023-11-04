package com.example.correction_test.entitie;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idTransaction;
    double montant;
    @Enumerated(EnumType.STRING)
    TypeTransaction type;
    Date dateTransaction;
    @ManyToOne
    Compt destinataire;
    @ManyToOne
    Compt expediteur;
}
