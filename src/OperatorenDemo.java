public class OperatorenDemo {
    public static void main(String[] args) {
        
        /*
            Mathematische Operatoren: +, -, *, /, % (modulo)
            Bitweise Operatoren: &&, ||, (&, |, ^), ! 
            Uniäre Operatoren: ++var; var++, --var; var--; 
            Vergleichsoperatoren: <, >, <=, >=, ==
            Zuweisungsoperator: =
         */
        
        int variableA = 9; // Deklarieren die Variable, Überschreiben den Wert auf 9, Zuweisungsoperator
        int variableB = 11;
        System.out.println("variableB / variableA = " + variableB / variableA);
        System.out.println("variableB / variableA = " + variableB / (variableA * 1.0));
        System.out.println("variableB % variableA = " + variableB % variableA);

        System.out.println("variableB++ = " + variableB++);
        System.out.println("variableB = " + variableB);
        System.out.println("++variableB = " + (++variableB));
        
        boolean isWednesday = true;
        boolean isSoftwareDevelopment = true;
        boolean isSoftwareDevelopomentEasy = false;

        System.out.println("(isSoftwareDevelopment && isWednesday) = " + (isSoftwareDevelopment && isWednesday));
        System.out.println("(isSoftwareDevelopment && isSoftwareDevelopomentEasy) = " + (isSoftwareDevelopment && isSoftwareDevelopomentEasy));
        System.out.println("(isSoftwareDevelopment || isSoftwareDevelopomentEasy) = " + (isSoftwareDevelopment || isSoftwareDevelopomentEasy));
        System.out.println("!isWednesday = " + !isWednesday);
        
        boolean graterThan10 = variableA > 10;
        System.out.println("graterThan10 = " + graterThan10);

        variableB = 11;
        boolean equals11 = variableB == 11;
        System.out.println("equals11 = " + equals11);

        String text1 = "Hello";
        String text2 = "Hello";
        System.out.println("text1.equals(text2) = " + text1.equals(text2));
        System.out.println("text1 == text2 = " + (text1 == text2)); // !!! ACHTUNG nicht verwenden

    }
}
