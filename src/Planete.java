public class Planete {
    String nom;
    String matiere;
    long diametre;

    int revolution(int angle){
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile.");
        return angle / 360;
    }

    int rotation(int angle){
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même.");
        return angle / 360;
    }
}
