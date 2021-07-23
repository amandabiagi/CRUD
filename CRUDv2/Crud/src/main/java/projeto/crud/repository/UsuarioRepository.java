package projeto.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.crud.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Optional<Usuario> findByEmailUsuario(String email);
}
