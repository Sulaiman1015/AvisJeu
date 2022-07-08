package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Jeu;

public interface JeuDao extends JpaRepository<Jeu, Long> {

}
