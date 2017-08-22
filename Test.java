import onecore.Algorithms;

public class Test{
    public static void main(String[] args){
        Algorithms test = new Algorithms();

        /*test.isUniqueString("uno dos tres");
        test.isUniqueString("asdcvbuio");

        test.reverse("hola gustavo");
        */
        String input = "ABACBDDEXEHAFAAAFFFCCCvsxxSDFABCDEEDz1";
        test.removeDuplicated(input.toCharArray());
    }
}