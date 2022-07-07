package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
