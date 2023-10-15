package methods;

public class NatoAlphabet {
    public static void main(String[] args) {
        convertToNato('a');
        convertToNato('b');
        convertToNato('c');
        convertToNato('d');
        convertToNato('e');
        convertToNato('x');
    }

    public static void convertToNato(char letter) {
        // note: only doing this for letters A thru E
        switch(letter) {
            case 'a':
                System.out.println(letter + ": Able");
                break;
            case 'b':
                System.out.println(letter + ": Baker");
                break;
            case 'c':
                System.out.println(letter + ": Charlie");
                break;
            case 'd':
                System.out.println(letter + ": Dog");
                break;
            case 'e':
                System.out.println(letter + ": Easy");
                break;
            default:
                System.out.println(letter + ": Letter Not Found!");
                break;
       }
    }
}
