package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Genre;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
