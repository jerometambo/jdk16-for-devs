package org.jerometambo.jdk16;

import java.time.Duration;
import java.time.ZonedDateTime;

public record EvenementSismique(int intensite, ZonedDateTime date, Duration duree) {
}
