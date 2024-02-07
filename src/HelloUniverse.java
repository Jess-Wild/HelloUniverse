public class HelloUniverse {

    public static void main(String... args){

        int rotationResult;

        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.matiere = "Tellurique";
        mercure.diametre= 4880;

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12100;
        rotationResult = venus.rotation(1250);
        System.out.println(venus.nom + " a effectué " + rotationResult + " tours complets sur elle-même.");

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756;

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792;
        rotationResult = mars.rotation(-684);
        System.out.println(mars.nom + " a effectué " + rotationResult + " tours complets sur elle-même.");

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
        rotationResult = neptune.revolution(-3542);
        System.out.println(neptune.nom + " a effectué " + rotationResult + " tours complets autour de son étoile.");

    }
}