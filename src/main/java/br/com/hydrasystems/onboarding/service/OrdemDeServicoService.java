package br.com.hydrasystems.onboarding.service;

import java.util.List;

import br.com.hydrasystems.onboarding.model.OrdemDeServico;

public interface OrdemDeServicoService {

    List<OrdemDeServico> findAll();
    OrdemDeServico findById(long id);
    OrdemDeServico save(OrdemDeServico ordemdeservico);
    OrdemDeServico deleteById(Long id);
    
}
