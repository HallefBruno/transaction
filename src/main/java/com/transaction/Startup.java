package com.transaction;

import com.transaction.service.EnderecoService;
import com.transaction.service.PessoaService;
import com.transaction.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Startup implements CommandLineRunner {
    
    @Autowired
    private PessoaService pessoaService;
    
    @Autowired
    private TelefoneService telefoneService;
    
    @Autowired
    private EnderecoService enderecoService;
    
    
    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Salva pessoa mesmo que os outros métodos abaixo dê erro.
        this.pessoaService.salvar();
        this.telefoneService.salvar(null);
        this.enderecoService.salvar(null);
    }

}
