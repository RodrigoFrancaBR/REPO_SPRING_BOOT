package br.com.franca.prjSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.franca.prjSpringBoot.model.Unidade;

public interface Unidades  extends JpaRepository<Unidade, Long> {

}
