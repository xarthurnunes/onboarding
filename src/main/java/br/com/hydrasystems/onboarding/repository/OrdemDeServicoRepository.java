package br.com.hydrasystems.onboarding.repository;

import java.util.List;

import br.com.hydrasystems.onboarding.model.OrdemDeServico;

import org.springframework.data.repository.CrudRepository;

public interface OrdemDeServicoRepository extends CrudRepository<OrdemDeServico, Long> {
    List<OrdemDeServico> findByNomeFuncionarioContainingIgnoreCase(String nomeFuncionario);
    List<OrdemDeServico> findAll();
    void deleteById(Long id);
}
