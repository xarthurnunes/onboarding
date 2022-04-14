package br.com.hydrasystems.onboarding.service.serviceImpl;

import java.util.List;

import br.com.hydrasystems.onboarding.model.OrdemDeServico;
import br.com.hydrasystems.onboarding.repository.OrdemDeServicoRepository;
import br.com.hydrasystems.onboarding.service.OrdemDeServicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemDeServicoServiceImpl implements OrdemDeServicoService {

    @Autowired
    OrdemDeServicoRepository ordemDeServicoRepository;



    @Override
    public List<OrdemDeServico> findAll() {
        return ordemDeServicoRepository.findAll();
    }

    @Override
    public OrdemDeServico findById(long id) {
        return ordemDeServicoRepository.findById(id).get();
    }

    @Override
    public OrdemDeServico save(OrdemDeServico ordemdeservico) {
        return ordemDeServicoRepository.save(ordemdeservico);
    }

    @Override
    public OrdemDeServico deleteById(Long id) {
        return null; //ordemDeServicoRepository.deleteById(id);
    }
    
}
