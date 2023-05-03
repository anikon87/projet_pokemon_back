package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.PokemonRepository;
import com.intiformation.modele.Pokemon;

@Service
public class PokemonService {

	@Autowired
	PokemonRepository pokemonRepository;
	
	public Pokemon addPokemeon (Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public Pokemon updatePokemeon (Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public void deletePokemon (Long id) {
		pokemonRepository.deleteById(id);
	}
	
	public Pokemon getPokemonById(Long id) {
	Optional<Pokemon> optpokemon =	pokemonRepository.findById(id);
	Pokemon pokemon = null;
	if (optpokemon.isPresent()) {
		pokemon = optpokemon.get();
	}
		return pokemon;
	}
	
	public List<Pokemon> getALlPokemon(){
		return pokemonRepository.findAll();
	}
}
