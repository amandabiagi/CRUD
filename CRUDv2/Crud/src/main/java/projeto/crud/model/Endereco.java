package projeto.crud.model;
import projeto.crud.viacep.EnderecoViaCep;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;

    @NotNull
    private String cep;

    @NotNull
    private String nomeRua;

    @NotNull
    private String numero;

    @NotNull
    private String complemento;

    @NotNull
    private String bairro;

    @NotNull
    private String cidade;

    @NotNull
    private String estado;


    public Endereco(Integer idEndereco, @NotNull String cep, @NotNull String nomeRua, @NotNull String numero, @NotNull String complemento, @NotNull String bairro, @NotNull String cidade, @NotNull String estado) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(EnderecoViaCep enderecoViaCep, String numero, String complemento) {
        this.idEndereco = enderecoViaCep.getId();
        this.cep = enderecoViaCep.getCep();
        this.nomeRua = enderecoViaCep.getLogradouro();
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = enderecoViaCep.getBairro();
        this.cidade = enderecoViaCep.getLocalidade();
        this.estado = enderecoViaCep.getUf();

    }

    public Endereco() {
    }



    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
