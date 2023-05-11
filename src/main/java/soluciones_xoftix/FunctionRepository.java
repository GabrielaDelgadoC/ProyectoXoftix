package soluciones_xoftix;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FunctionRepository extends JpaRepository<Function, Long> {
    Optional<Function> findByName(String name);
    void deleteByName(String name); // Eliminar una función por su nombre
    Function save(Function function); // Guardar una función en la base de datos
}

