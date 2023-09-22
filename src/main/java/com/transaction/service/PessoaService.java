package com.transaction.service;

import com.transaction.model.Pessoa;
import com.transaction.repository.PessoaRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;
    
    @Autowired
    public PessoaService(PessoaRepository pessoaRepository, EnderecoService enderecoService) {
        this.pessoaRepository = pessoaRepository;
    }
    
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void salvar() {
        var pessoa = new Pessoa();
        pessoa.setId(UUID.randomUUID());
        pessoa.setIdade(34);
        pessoa.setNome("Maria José");
        this.pessoaRepository.save(pessoa);
        
    }
    
}
