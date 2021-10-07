package org.jerometambo.jdk16;

public class LigneFacture {
    
    private TypeLigneFacture typeLigneFacture;
    private Etat etat;
    
    public LigneFacture(final TypeLigneFacture typeLigneFacture) {
        this.typeLigneFacture = typeLigneFacture;
    }
    
    public TypeLigneFacture getTypeLigneFacture() {
        return typeLigneFacture;
    }
    
    public void setTypeLigneFacture(final TypeLigneFacture typeLigneFacture) {
        this.typeLigneFacture = typeLigneFacture;
    }
    
    public Etat getEtat() {
        return etat;
    }
    
    public void setEtat(final Etat etat) {
        this.etat = etat;
    }
    
    public enum TypeLigneFacture {
        ACHAT,
        VENTE;
    }
    
    public enum Etat {
        A_TRAITER,
        TRAITE;
    }
}
