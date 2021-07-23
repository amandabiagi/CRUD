package projeto.crud.repository;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import projeto.crud.model.Cadastro;

import java.util.List;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

    Page<Cadastro> findByNomeCompleto(String nomeCompleto,Pageable paginacao);

    Page<Cadastro> findByCpf(String cpf,Pageable paginacao);


}
