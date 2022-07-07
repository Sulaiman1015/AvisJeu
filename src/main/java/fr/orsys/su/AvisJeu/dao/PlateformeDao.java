package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Plateforme;

public interface PlateformeDao extends JpaRepository<Plateforme, Long> {

}
