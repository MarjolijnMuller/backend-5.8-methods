public class B_Dialoog {

    public static void main(String[] args) {
        // In deze dialoog praten Bert en Ernie met elkaar.
        // Maak methode bertSays die "Bert says: " + de string print en een methode ernieSays die de string " says Ernie" print.
        // De methode heeft als parameter de tekst die gesproken moet worden.
        // De volgende zin wordt steeds door de ander gesproken.
        // Vervang System.out.println() steeds door je eigen method.
        System.out.println(bertSays("Hey")); //Bert
        System.out.println(ernieSays("Hey")); //Ernie
        System.out.println(bertSays("Welcome to this wonderful conversation"));
        System.out.println(ernieSays("Thnx, I'm looking forward to it"));
        System.out.println(bertSays("How about this weather?"));
        System.out.println(ernieSays("I really don't mind the cold...."));
        System.out.println(bertSays("And did you see that random program on that random channel?"));
        System.out.println(ernieSays("Well... I did watch a random program on a random channel..."));
        System.out.println(bertSays("Thank you for a wonderful conversation!"));
        System.out.println(ernieSays("Cya"));
    }

    public static String bertSays(String sentence){
        return("Bert says: " + sentence);
    }

    public static String ernieSays(String sentence) {
        return(sentence + " says Ernie");
    }
}
