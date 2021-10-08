package org.jerometambo.jdk16;

import java.time.Duration;
import java.time.ZonedDateTime;

public record EvenementSismique(int intensite, ZonedDateTime date, Duration duree) {
    
    public EvenementSismique {
        if (intensite < 5) {
            throw new IllegalArgumentException("Evenement sismique non valide : intensité trop faible");
        }
        
    }
    
    // On peut ajouter des constructeurs, tant que tous les attributs sont initialisés
    public EvenementSismique() {
        this(5, ZonedDateTime.now(), Duration.ofHours(1));
    }
}
