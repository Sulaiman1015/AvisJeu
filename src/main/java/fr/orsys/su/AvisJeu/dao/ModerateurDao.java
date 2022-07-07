package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Moderateur;

public interface ModerateurDao extends JpaRepository<Moderateur, Long> {

}
