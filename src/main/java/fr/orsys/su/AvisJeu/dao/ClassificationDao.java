package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.Classification;

public interface ClassificationDao extends JpaRepository<Classification, Long> {

}
