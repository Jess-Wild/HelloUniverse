public class HelloUniverse {

    public static void main(String... args){

        int rotationResult;

        System.out.println("La forme d'une planète est : " + Planete.forme + ".");
        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        /*---MERCURE---*/
        Planete mercure = new Planete("Mercure");
//        mercure.nom = "Mercure";
        mercure.matiere = "Tellurique";
        mercure.diametre= 4880;
        Atmosphere atmosphereMercure = new Atmosphere();
        atmosphereMercure.tauxOxygene = 42;
        atmosphereMercure.tauxSodium = 29;
        atmosphereMercure.tauxHydrogene = 22;
        atmosphereMercure.tauxAutreGaz = 7;
        System.out.println("L'atmosphère de Mercure est composée :");
        System.out.println("A " + mercure.atmosphere.tauxOxygene + "% d'oxygène. ");
        System.out.println("A " + mercure.atmosphere.tauxSodium + "% de Sodium. ");
        System.out.println("A " + mercure.atmosphere.tauxHydrogene + "% d'hydrogène.");
        System.out.println("A " + mercure.atmosphere.tauxAutreGaz + "% d'autres gaz.");


        /*---VENUS---*/
        Planete venus = new Planete("Venus");
//        venus.nom = "Venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12100;
        Atmosphere atmosphereVenus = new Atmosphere();
        atmosphereVenus.tauxDioxydeCarbone = 96;
        atmosphereVenus.tauxAzote = 3;
        atmosphereVenus.tauxAutreGaz = 1;
        venus.atmosphere = atmosphereVenus;
        System.out.println("L'atmosphère de Venus est composée :");
        System.out.println("A " + venus.atmosphere.tauxDioxydeCarbone + "% de dioxyde de carbone. ");
        System.out.println("A " + venus.atmosphere.tauxAzote + "% d'azote. ");
        System.out.println("A " + venus.atmosphere.tauxAutreGaz + "% d'autres gaz.");
        rotationResult = venus.rotation(1250);
        System.out.println(venus.nom + " a effectué " + rotationResult + " tours complets sur elle-même.");

        /*---LA TERRE---*/
        Planete terre = new Planete("Terre");
//        terre.nom = "Terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756;
        Atmosphere atmosphereTerre = new Atmosphere();
        atmosphereTerre.tauxAzote = 78;
        atmosphereTerre.tauxOxygene = 21;
        atmosphereTerre.tauxArgon = 1;
        atmosphereTerre.tauxAutreGaz = 1;
        terre.atmosphere = atmosphereTerre;
        System.out.println("L'atmosphère de La Terre est composée :");
        System.out.println("A " + terre.atmosphere.tauxAzote + "% d'azote. ");
        System.out.println("A " + terre.atmosphere.tauxOxygene + "% d'oxygène. ");
        System.out.println("A " + terre.atmosphere.tauxArgon + "% d'argon.");
        System.out.println("A " + terre.atmosphere.tauxAutreGaz + "% d'autres gaz.");


        /*---MARS---*/
        Planete mars = new Planete("Mars");
//        mars.nom = "Mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792;
        System.out.println("La forme de Mars est : " + mars.forme + ".");

        /*---ATMOSPHERE---*/
        Atmosphere atmosphereMars = new Atmosphere();
        atmosphereMars.tauxDioxydeCarbone = 95;
        atmosphereMars.tauxAzote = 3;
        atmosphereMars.tauxArgon = 1.5f;
        atmosphereMars.tauxAutreGaz = 0.5f;
        mars.atmosphere = atmosphereMars;
        System.out.println("L'atmosphère de Mars est composée :");
        System.out.println("A " + mars.atmosphere.tauxDioxydeCarbone + "% de dioxyde de carbone.");
        System.out.println("A " + mars.atmosphere.tauxAzote + "% d'azote. ");
        System.out.println("A " + mars.atmosphere.tauxArgon + "% d'argon.");
        System.out.println("A " + mars.atmosphere.tauxAutreGaz + "% d'autres gaz.");

        /*---ROTATION---*/
        rotationResult = mars.rotation(-684);
        System.out.println(mars.nom + " a effectué " + rotationResult + " tours complets sur elle-même.");

        /*---VAISSEAUX---*/
        Vaisseau premierVaisseau = new Vaisseau();
        premierVaisseau.type = "FREGATE";
        premierVaisseau.nbPassagers = 9;
        Vaisseau enPartance = mars.accueillirVaisseau(premierVaisseau);
        Vaisseau secondVaisseau = new Vaisseau();
        secondVaisseau.type = "CROISSEUR";
        secondVaisseau.nbPassagers = 42;
        enPartance = mars.accueillirVaisseau(secondVaisseau);
        System.out.println("Le nombre d'humains ayant déjà séjouré sur " + mars.nom + " est actuellement de " + mars.totalVisiteurs + ".");

        /*---JUPITER---*/
        Planete jupiter = new Planete("Jupiter");
//        jupiter.nom = "Jupiter";
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142984;
        Atmosphere atmosphereJupiter = new Atmosphere();
        atmosphereJupiter.tauxHydrogene = 90;
        atmosphereJupiter.tauxHelium = 10;
        atmosphereJupiter.tauxAutreGaz = 1;
        jupiter.atmosphere = atmosphereJupiter;
        System.out.println("L'atmosphère de Jupiter est composée :");
        System.out.println("A " + jupiter.atmosphere.tauxHydrogene + "% d'hydrogène.");
        System.out.println("A " + jupiter.atmosphere.tauxHelium + "% d'hélium. ");
        System.out.println("A " + jupiter.atmosphere.tauxAutreGaz + "% d'autres gaz.");

        /*---SATURNE---*/
        Planete saturne = new Planete("Saturne");
//        saturne.nom = "Saturne";
        saturne.matiere = "Gazeuse";
        saturne.diametre = 120536;
        Atmosphere atmosphereSaturne = new Atmosphere();
        atmosphereSaturne.tauxHydrogene = 96;
        atmosphereSaturne.tauxHelium = 3;
        atmosphereSaturne.tauxAutreGaz = 1;
        saturne.atmosphere = atmosphereSaturne;
        System.out.println("L'atmosphère de Saturne est composée :");
        System.out.println("A " + saturne.atmosphere.tauxHydrogene + "% d'hydrogène.");
        System.out.println("A " + saturne.atmosphere.tauxHelium + "% d'hélium. ");
        System.out.println("A " + saturne.atmosphere.tauxAutreGaz + "% d'autres gaz.");

        /*---URANUS---*/
        Planete uranus = new Planete("Uranus");
//        uranus.nom = "Uranus";
        uranus.matiere = "Gazeuse";
        uranus.diametre = 51118;
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83;
        atmosphereUranus.tauxHelium = 15;
        atmosphereUranus.tauxMethane = 2.5f;
        uranus.atmosphere = atmosphereUranus;
        System.out.println("L'atmosphère de Uranus est composée :");
        System.out.println("A " + uranus.atmosphere.tauxHydrogene + "% d'hydrogène.");
        System.out.println("A " + uranus.atmosphere.tauxHelium + "% d'hélium. ");
        System.out.println("A " + uranus.atmosphere.tauxMethane + "% de méthane.");

        /*---NEPTUNE---*/
        Planete neptune = new Planete("Neptune");
//        neptune.nom = "Neptune";
        neptune.matiere = "Gazeuse";
        neptune.diametre = 49532;
        Atmosphere atmosphereNeptune = new Atmosphere();
        atmosphereNeptune.tauxHydrogene = 80;
        atmosphereNeptune.tauxHelium = 19;
        atmosphereNeptune.tauxMethane = 1;
        neptune.atmosphere = atmosphereNeptune;
        System.out.println("L'atmosphère de Neptune est composée :");
        System.out.println("A " + neptune.atmosphere.tauxHydrogene + "% d'hydrogène.");
        System.out.println("A " + neptune.atmosphere.tauxHelium + "% d'hélium. ");
        System.out.println("A " + neptune.atmosphere.tauxMethane + "% de méthane.");
        rotationResult = neptune.revolution(-3542);
        System.out.println(neptune.nom + " a effectué " + rotationResult + " tours complets autour de son étoile.");

        System.out.println("Le nombre de Planète découverte à ce jour est de : " + Planete.nbPlanetesDecouvertes);

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type = "CHASSEUR";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "VAISSEAU-MONDE";
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        chasseur.attaque(vaisseauMonde, "lasers photoniques", 3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("La resistance du bouclier du VAISSEAU-MONDE est de : " + vaisseauMonde.resistanceDuBouclier );
        System.out.println("Le blindage du VAISSEAU-MONDE est de : " + vaisseauMonde.blindage);

    }
}