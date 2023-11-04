package com.example.correction_test.entitie;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class Compt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idCompt;
    @Enumerated(EnumType.STRING)
    TypeCompte type;
    double solde;
    long code;

}
