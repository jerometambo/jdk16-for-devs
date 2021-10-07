package org.jerometambo.jdk16;

import java.time.Duration;
import java.time.ZonedDateTime;

public final class EvenementSismiqueData {
    
    private int intensite;
    private ZonedDateTime date;
    private Duration duree;
    
    public EvenementSismiqueData(int intensite, ZonedDateTime date, Duration duree) {
        this.intensite = intensite;
        this.date = date;
        this.duree = duree;
    }
    
    public int getIntensite() {
        return intensite;
    }
    
    public void setIntensite(final int intensite) {
        this.intensite = intensite;
    }
    
    public ZonedDateTime getDate() {
        return date;
    }
    
    public void setDate(final ZonedDateTime date) {
        this.date = date;
    }
    
    public Duration getDuree() {
        return duree;
    }
    
    public void setDuree(final Duration duree) {
        this.duree = duree;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        
        final EvenementSismiqueData that = (EvenementSismiqueData) o;
        
        if (intensite != that.intensite)
            return false;
        if (date != null ? !date.equals(that.date) : that.date != null)
            return false;
        return duree != null ? duree.equals(that.duree) : that.duree == null;
    }
    
    @Override
    public int hashCode() {
        int result = intensite;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (duree != null ? duree.hashCode() : 0);
        return result;
    }
}
