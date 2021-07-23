package projeto.crud.model.dto;

import org.springframework.data.domain.Page;
import projeto.crud.model.Cadastro;

public class CadastroDTO {


    private String nomeCompleto;

    private String cpf;

    private String email;

    public CadastroDTO(Cadastro cadastro) {
        this.nomeCompleto = cadastro.getNomeCompleto();
        this.cpf = cadastro.getCpf();
        this.email = cadastro.getEmail();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Page<CadastroDTO> converter(Page<Cadastro> cadastros){
        return cadastros.map(CadastroDTO::new);
    };


}
