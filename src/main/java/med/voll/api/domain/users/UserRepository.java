package med.voll.api.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Repository que conecta la aplicación con la tabla usuarios en la base de datos
 */
public interface UserRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String username);
}
