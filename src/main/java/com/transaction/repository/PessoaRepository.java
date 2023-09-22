package com.transaction.repository;

import com.transaction.model.Pessoa;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {
    
}
