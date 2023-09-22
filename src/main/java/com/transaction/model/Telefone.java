package com.transaction.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
public class Telefone implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    private String numero;
    
    @OneToOne
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id", unique = true, nullable = false, table = "telefone", updatable = false)
    private Pessoa pessoa;
    
}
