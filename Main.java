public class Main {
    public static void main(String[] args){
        ///////////////////////////////////////////////
        //Calculator
        Calculator calc = new Calculator();
        System.out.println(calc.Add(1.2,2));
        System.out.println(calc.Subtract(12,24));
        System.out.println(calc.Multiply(4,5));
        System.out.println(calc.Divide(20,5));
        ///////////////////////////////////////////////
        //Product
        Product prod = new Product();
        System.out.println(prod.getVoteCount(13,0));
        System.out.println(prod.getVoteCount(2,33));
        System.out.println(prod.getVoteCount(132,132));
        ///////////////////////////////////////////////
        //Person
        Person p1 = new Person("Samuel",24);
        Person p2 = new Person("Joel",36);
        Person p3 = new Person("Lily",24);
        p1.compareAge(p2);
        p2.compareAge(p1);
        p1.compareAge(p3);
        ///////////////////////////////////////////////
        //LukeSkywalker
        LukeSkywalker Luke = new LukeSkywalker();
        Luke.setFatherName("Darth Vader");
        Luke.setSisterName("Leia");
        Luke.setBrotherinlawName("Han");
        Luke.setDroidName("R2D2");
        Luke.relationToLuke("R2D2");
        ///////////////////////////////////////////////
        //CustomMath
        CustumMath CM = new CustumMath();
        System.out.println(CM.nextPrime(89));
    }
}
