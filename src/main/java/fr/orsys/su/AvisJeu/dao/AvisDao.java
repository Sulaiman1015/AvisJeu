package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Avis;

public interface AvisDao extends JpaRepository<Avis, Long> {

}
