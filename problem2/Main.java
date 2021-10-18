public class Main {

    public static String transformString(StringModifier modifierArg, String stringArg) {
        return modifierArg.modify(stringArg);
    }

    public static void main(String[] args) {
	    String initialString = "Hello";
	    String toShowString = "NOT SET YET";

        // TODO: After implementing the Reverser class, uncomment the section below
        // toShowString should be assigned "olleH"
        /*
	    Reverser reverser = new Reverser();
	    toShowString = transformString(reverser, initialString);
         */

	    System.out.println("Initial string: " + initialString);
	    System.out.println("Modified string: " + toShowString);
    }
}
