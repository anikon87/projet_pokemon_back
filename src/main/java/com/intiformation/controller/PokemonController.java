package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.modele.Pokemon;
import com.intiformation.service.PokemonService;

@RestController
@RequestMapping("pokemonapi")
@CrossOrigin("http://localhost:4200")
public class PokemonController {

	@Autowired
	PokemonService pokemonService;
	
	@PostMapping
	public Pokemon ajouterPokemon(@RequestBody Pokemon pokemon) {
		return  pokemonService.addPokemeon(pokemon);
	}
	
	@PutMapping
	public Pokemon modifierPokemon (@RequestBody Pokemon pokemon) {
		return pokemonService.updatePokemeon(pokemon);
	}
	
	@DeleteMapping("/{id}")
	public void supprimerPokemon (@PathVariable("id") Long id) {
		pokemonService.deletePokemon(id);
	}
	
	@GetMapping("/{id}")
	public Pokemon obtenirUnPokemonParId (@PathVariable("id") Long id) {
		return pokemonService.getPokemonById(id);
	}
	
	@GetMapping
	public List<Pokemon> obtenirListePokemons(){
		return pokemonService.getALlPokemon();
	}
}
