package fr.orsys.su.AvisJeu.bussiness;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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

public class Jeu<Plateforme> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String description;
    private LocalDate dateSortie;
    private String image;

    @ManyToOne
    private Moderateur moderator;

    @OneToOne
    private ModeleEconomique modeleEconomique;

    @ManyToMany(mappedBy = "plateforme")
    List<Plateforme> plateforme;

    @ManyToOne
    private Editeur editeur;

    @ManyToOne
    private Genre genre;

    @ManyToOne
    private Classification classification;

    @OneToMany(mappedBy = "jeu") // mweeeeeu avis<> jeu
    private Avis avis;
}
