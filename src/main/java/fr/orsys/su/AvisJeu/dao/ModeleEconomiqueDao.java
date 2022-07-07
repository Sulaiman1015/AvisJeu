package fr.orsys.su.AvisJeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.su.AvisJeu.bussiness.ModeleEconomique;

public interface ModeleEconomiqueDao extends JpaRepository<ModeleEconomique, Long> {

}
