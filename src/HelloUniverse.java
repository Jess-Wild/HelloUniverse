public class HelloUniverse {

    public static void main(String... args){

        String phraseIntroduction = "En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes = 0;

        int annee = 1987;
        /*if(annee >= 2006 ){
            nbPlanetes = 8;
        }else{
            nbPlanetes = 9;
        }
        System.out.printf(phraseIntroduction, annee, nbPlanetes);*/

        if(annee < 1600 || annee > 2020){
            System.out.printf("Le programme ne peut pas fournir de résultat pour %d", annee);
        } else {
            if (annee < 1700) {
                nbPlanetes = 7;
            } else if (annee < 1800 || annee >= 2006) {
                nbPlanetes = 8;
            }else {
                nbPlanetes = 9;
            }
            System.out.printf(phraseIntroduction, annee, nbPlanetes);
        }



    }

    //1600, 1700, 1800, 2006 et 2020
    //Si inférieur à 1600 ou suppérieur à 2020 inclus = afficher "Le programme ne peut pas fournir de résultat pour l'année <année>"
    //Si inférieur à 1700 = le nombre de planètes est de 7
    //Si inférieur à 1800 le nombre de planètes est de 8
    //Si suppérieur à 2006
}