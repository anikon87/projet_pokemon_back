package com.intiformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
