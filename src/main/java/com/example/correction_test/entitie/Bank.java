package com.example.correction_test.entitie;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class Bank implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idBonk;
    String nom;
    String agence;
    String adress;
    @OneToMany
    Set<Compt> listCmpt ;

}
