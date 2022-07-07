package fr.orsys.su.AvisJeu.bussiness;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Joueur extends Utilisateur {

    private LocalDate dateDeNaissance;

    @OneToMany(mappedBy = "Joueur")
    List<Avis> avis;

}