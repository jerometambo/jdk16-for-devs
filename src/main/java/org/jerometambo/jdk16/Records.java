package org.jerometambo.jdk16;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Records {
    
    public static void main(String... args) {
        EvenementSismiqueData evenementSismique = new EvenementSismiqueData(10, ZonedDateTime.now(), Duration.ofHours(1));
        EvenementSismique evenementSismiqueRecord = new EvenementSismique(6, ZonedDateTime.now(), Duration.ofHours(1));
    
        System.out.println(evenementSismique);
        System.out.println(evenementSismiqueRecord);
        
        EvenementSismique evenementSismiqueRecordControle = new EvenementSismique(2, ZonedDateTime.now(), Duration.ofHours(1));
    }
}
