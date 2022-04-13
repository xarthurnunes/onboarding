package br.com.hydrasystems.onboarding.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hydrasystems.onboarding.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    public Optional<UsuarioModel> findByLogin(String login);

}

    

