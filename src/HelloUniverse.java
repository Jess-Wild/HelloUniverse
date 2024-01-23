public class HelloUniverse {

    public static void main(String... args){
        String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        int nbPlanetes=8;
        System.out.println(phrase + nbPlanetes);
        nbPlanetes++;
        phrase="Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(phrase + nbPlanetes);
    }

}