public class HelloUniverse {

    public static void main(String... args){

        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.matiere = "Tellurique";
        mercure.diametre= 4880;

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12100;

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756;

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792;

        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142984;

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.matiere = "Gazeuse";
        saturne.diametre = 120536;

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.matiere = "Gazeuse";
        uranus.diametre = 51118;

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.matiere = "Gazeuse";
        neptune.diametre = 49532;

        System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");
        

        int nbPlanetes = 7;

        while (nbPlanetes<10) {
            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);
            }
            nbPlanetes++;
        }



    }

    //1600, 1700, 1800, 2006 et 2020
    //Si inférieur à 1600 ou suppérieur à 2020 inclus = afficher "Le programme ne peut pas fournir de résultat pour l'année <année>"
    //Si inférieur à 1700 = le nombre de planètes est de 7
    //Si inférieur à 1800 le nombre de planètes est de 8
    //Si suppérieur à 2006
}