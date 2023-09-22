package com.transaction.service;

import com.transaction.model.Endereco;
import com.transaction.model.Pessoa;
import com.transaction.repository.EnderecoRepository;
import java.util.Set;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnderecoService {
    
    
    private EnderecoRepository enderecoRepository;
    
    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }
    
    @Transactional
    public void salvar(Pessoa pessoa) {
        var endereco = new Endereco();
        endereco.setId(UUID.randomUUID());
        endereco.setLogradouro("Avenida Goiás");
        endereco.setPessoa(Set.of(pessoa));
        this.enderecoRepository.save(endereco);
    }

}
