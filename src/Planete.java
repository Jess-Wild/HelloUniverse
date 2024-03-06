public class Planete {

    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes = 0;
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;
    Vaisseau vaisseauAmmarer;

    int revolution(int angle){
        return angle / 360;
    }

    int rotation(int angle){
        return angle / 360;
    }

    Atmosphere atmosphere = new Atmosphere();

    Planete(String nom){
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    static String expansion(double distance){
        if(distance < 14){
            return"Oh la la mais c'est super rapide !";
        }else{
            return"Je rêve ou c'est plus rapide que la lumière ?";
        }
    }


    Vaisseau accueillirVaisseau(Vaisseau vaisseau){

        if(vaisseauAmmarer == null ){
            System.out.println(vaisseauAmmarer);
            System.out.println("Aucun vaisseau ne s'en va.");

        }else {
            System.out.println("Un vaisseau de type " + vaisseauAmmarer.type +" doit s'en aller.");

        }

        totalVisiteurs = totalVisiteurs + vaisseau.nbPassagers;
        Vaisseau vaisseauPrecedent = vaisseauAmmarer;
        vaisseauAmmarer = vaisseau;


        return vaisseauPrecedent;
    }
}
