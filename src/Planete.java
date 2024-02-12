public class Planete {
    String nom;
    String matiere;
    long diametre;

    int nbTotalVisiteurs;

    int revolution(int angle){
        return angle / 360;
    }

    int rotation(int angle){
        return angle / 360;
    }

    Atmosphere atmosphere = new Atmosphere();

    void accueillirVaisseau(int nbHumains){
        nbTotalVisiteurs = nbTotalVisiteurs + nbHumains;
    };

    void accueillirVaisseau(String typeVaisseau){
       if (typeVaisseau.equalsIgnoreCase("CHASSEUR")){
           nbTotalVisiteurs = nbTotalVisiteurs + 3;
       } else if (typeVaisseau.equalsIgnoreCase("FREGATE")) {
           nbTotalVisiteurs = nbTotalVisiteurs + 12;
       } else if (typeVaisseau.equalsIgnoreCase("CROISEUR")) {
           nbTotalVisiteurs = nbTotalVisiteurs + 50;
       }else {
           System.out.println("Ce vaisseau est inconnu de nos services");
       }
    }
}
