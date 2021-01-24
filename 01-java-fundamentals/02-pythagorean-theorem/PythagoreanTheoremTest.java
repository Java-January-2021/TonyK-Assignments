public class PythagoreanTheoremTest{
    public static void main(String[] args){
        PythagoreanTheorem pyth = new PythagoreanTheorem();
        double hypotenuse = pyth.calculateHypotenuse(3,4);
        System.out.println(hypotenuse);
    }
}