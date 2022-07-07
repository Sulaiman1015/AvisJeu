package fr.orsys.su.AvisJeu.bussiness;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private LocalDateTime dateEnvoi;
    private Float note;
    private LocalDateTime dateModeration;

    @ManyToOne       // mweuuuu   avis<> jeu
    private Jeu jeu;

    @ManyToOne
    private Moderateur moderateur;

    @ManyToOne
    private Joueur joueur;
}