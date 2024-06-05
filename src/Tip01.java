public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double Person1 = 10.00;
        double Person2 = 12.00;
        double Person3 = 9.00;
        double Person4 = 8.00;
        double Person5 = 7.00;
        double Person6 = 15.00;
        double Person7 = 11.00;
        double Person8 = 30.00;
        double Total1 = Person1*(1 +.05 +.15);
        double Total2 = Person2*(1 +.05 +.15);
        double Total3 = Person3*(1 +.05 +.15);
        double Total4 = Person4*(1 +.05 +.15);
        double Total5 = Person5*(1 +.05 +.15);
        double Total6 = Person6*(1 +.05 +.15);
        double Total7 = Person7*(1 +.05 +.15);
        double Total8 = Person8*(1 +.05 +.15);
        System.out.println(Total1);
        System.out.println(Total2);
        System.out.println(Total3);
        System.out.println(Total4);
        System.out.println(Total5);
        System.out.println(Total6);
        System.out.println(Total7);
        System.out.println(Total8);
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
