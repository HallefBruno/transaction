package com.transaction.service;

import com.transaction.model.Pessoa;
import com.transaction.model.Telefone;
import com.transaction.repository.TelefoneRepository;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TelefoneService {
    
    private TelefoneRepository telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }
    
    @Transactional
    public void salvar(Pessoa pessoa) {
        var telefone = new Telefone();
        telefone.setId(UUID.randomUUID());
        telefone.setNumero("62995282263");
        telefone.setPessoa(pessoa);
        this.telefoneRepository.save(telefone);
    }
    
}
