package projeto.crud.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCadastro;

    @NotBlank
    @Size(min = 3)
    private String nomeCompleto;

    @Email
    @NotNull
    private String email;

    @CPF
    @Column(unique = true)
    @NotNull
    private String cpf;

    private @NotNull @Past LocalDate dataNascimento;

    @Pattern(regexp = "(\\(?\\(\\d{2}\\)?\\))?(\\d{5}\\-\\d{4})")
    private String celular;

    @Pattern(regexp = "(\\(?\\(\\d{2}\\)?\\))?(\\d{4}\\-\\d{4})")
    private String telefone;

    @NotNull
    private String estadoCivil;

    @CreationTimestamp
   // @NotNull
    private LocalDateTime dataCriacao;

    //@NotNull
    private Boolean cadastroAtivo;

    @ManyToOne
    //@NotNull
    private Endereco endereco;

    public Cadastro(Integer idCadastro, @NotBlank @Size(min = 3) String nomeCompleto, @Email @NotNull String email, @CPF @NotNull String cpf, @NotNull @Past LocalDate dataNascimento, @Pattern(regexp = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})") String celular, @Pattern(regexp = "(\\(?\\d{2}\\)?\\s)?(\\d{4}\\-\\d{4})") String telefone, @NotNull String estadoCivil, @NotNull LocalDateTime dataCriacao, Boolean cadastroAtivo , @NotNull Endereco endereco) {
        this.idCadastro = idCadastro;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.dataCriacao = dataCriacao;
        this.cadastroAtivo = true;
        this.endereco = endereco;
    }

    public Cadastro(@NotBlank @Size(min = 3) String nomeCompleto, @CPF @NotNull String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.cadastroAtivo = true;
    }

    public Cadastro(@NotBlank @Size(min = 3) String nomeCompleto, @CPF @NotNull String cpf, Boolean ativo) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.cadastroAtivo = ativo;
    }


    public Cadastro() {
        this.cadastroAtivo = true;
    }

    public Boolean getCadastroAtivo() {
        return cadastroAtivo;
    }

    public void setCadastroAtivo(Boolean cadastroAtivo) {
        this.cadastroAtivo = cadastroAtivo;
    }

    public Integer getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public @NotNull @Past LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotNull @Past LocalDate dataNacimento) {
        this.dataNascimento = dataNacimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

