package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruankennedy.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}