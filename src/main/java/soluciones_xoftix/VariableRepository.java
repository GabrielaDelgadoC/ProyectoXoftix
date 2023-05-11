package soluciones_xoftix;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariableRepository extends JpaRepository<Variable, Long> {
    // Métodos para interactuar con la base de datos
    Optional<Variable> findByName(String name);
    Optional<Variable> findById(Long id); // Buscar una variable por su ID
    List<Variable> findAll(); // Obtener todas las variables
    Variable save(Variable variable); // Guardar una variable en la base de datos
    void deleteById(Long id); 
    void deleteByName(String name); // Eliminar una variable por su nombre
}
