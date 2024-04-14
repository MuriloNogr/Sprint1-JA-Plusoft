package br.com.fiap.challenge.challengeja.repository;

import br.com.fiap.challenge.challengeja.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}