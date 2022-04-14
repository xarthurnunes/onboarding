package br.com.hydrasystems.onboarding.controller;

import java.util.List;


import br.com.hydrasystems.onboarding.model.OrdemDeServico;
import br.com.hydrasystems.onboarding.service.OrdemDeServicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrdemServicoController {

    @Autowired
    OrdemDeServicoService ordemDeServicoService;
   
    
    @GetMapping(value="/sistema/mostraros/{id}")
    public ModelAndView getMostrar(@PathVariable Long id) {
        OrdemDeServico ordemDeServico = ordemDeServicoService.findById(id);
        ModelAndView modelAndView = new ModelAndView("mostraros");
        modelAndView.addObject("ordemdeservico", ordemDeServico);
        return modelAndView;
    }

    @PostMapping(value="/sistema/mostraros")
    public ModelAndView getMostrarOs(@PathVariable Long id) {
        OrdemDeServico ordemDeServico = ordemDeServicoService.findById(id);
        ModelAndView modelAndView = new ModelAndView("mostraros");
        modelAndView.addObject("ordemdeservico", ordemDeServico);
        return modelAndView;
    }
    
    @GetMapping(value="/sistema/cadastraros")
    public ModelAndView getCadastrar() {
        OrdemDeServico ordemDeServico = new OrdemDeServico();
        ModelAndView modelAndView = new ModelAndView("cadastraros");
        modelAndView.addObject("ordemdeservico", ordemDeServico);
        return modelAndView;
    }

    @PostMapping(value="/sistema/cadastraros")
    public ModelAndView postCadastrar(OrdemDeServico ordemDeServico) {
        OrdemDeServico ordemServicoSalva = ordemDeServicoService.save(ordemDeServico);
        return getMostrar(ordemServicoSalva.getId());
    }

    @GetMapping(value="/sistema/editaros/{id}")
    public ModelAndView getEditar(@PathVariable Long id) {
        OrdemDeServico ordemDeServico = ordemDeServicoService.findById(id);
        ModelAndView modelAndView = new ModelAndView("cadastraros");
        modelAndView.addObject("ordemdeservico", ordemDeServico);
        return modelAndView;
    }
    @RequestMapping(value="/sistema/buscaros", method=RequestMethod.GET)
    public ModelAndView getListar() {
        List<OrdemDeServico> lista = ordemDeServicoService.findAll();
        ModelAndView modelAndView = new ModelAndView("buscaros");
        modelAndView.addObject("lista", lista);
        return modelAndView;
    }
    
}
