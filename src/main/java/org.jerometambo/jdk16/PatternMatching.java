package org.jerometambo.jdk16;

public class PatternMatching {
    
    public static void main(String... args) {
        Object o = new Facture();
        Facture f = (Facture) o;
        
        init(f);
        
        if ((o instanceof Facture facture) && facture.getLignesFacture().stream().filter(lf -> LigneFacture.TypeLigneFacture.VENTE.equals(lf.getTypeLigneFacture())).findAny()
                .isPresent()) {
            var ligneFacture = facture.getLignesFacture().stream().filter(lf -> LigneFacture.TypeLigneFacture.VENTE.equals(lf.getTypeLigneFacture())).findAny().get();
            ligneFacture.setEtat(LigneFacture.Etat.TRAITE);
        } else {
            // facture.get
        }
    }
    
    private static void init(final Facture f) {
        f.getLignesFacture().add(new LigneFacture(LigneFacture.TypeLigneFacture.VENTE));
    }
}
