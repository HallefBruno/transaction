
package com.transaction.repository;

import com.transaction.model.Telefone;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, UUID> {
    
}
