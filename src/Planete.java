public class Planete {
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
