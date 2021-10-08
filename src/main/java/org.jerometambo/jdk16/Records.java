package org.jerometambo.jdk16;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Records {
    
    public static void main(String... args) {
        EvenementSismique evenementSismique = new EvenementSismique(10, ZonedDateTime.now(), Duration.ofHours(1));
        EvenementSismique evenementSismique2 = new EvenementSismique(2, ZonedDateTime.now(), Duration.ofHours(1));
        
        
    }
}
