package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Editeur;

public interface EditeurDao extends JpaRepository<Editeur, Long> {

}
