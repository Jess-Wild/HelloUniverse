public class HelloUniverse {

    public static void main(String... args){
        /*String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        int nbPlanetes=8;
        System.out.println(phrase + nbPlanetes);
        nbPlanetes++;
        phrase="Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(phrase + nbPlanetes);
         */
        
        String phraseIntroduction = "En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes = 0;

        int annee = 2014;
        if(annee >= 2006 ){
            nbPlanetes = 8;
        }else{
            nbPlanetes = 9;
        }
        System.out.printf(phraseIntroduction, annee, nbPlanetes);
    }

}