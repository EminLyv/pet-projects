public class Main {
    public static void main(String[] args) {
        Home FirstHome = new Home(43,false,"Yasamal",467);
        FirstHome.cost = 450;
        System.out.println(FirstHome.cost);

        Home SecondHome = new Home();
        SecondHome.sahe = 37;
        SecondHome.bina = true;
        SecondHome.location = "Nesimi";
        SecondHome.cost = 430;
        System.out.println(SecondHome.cost);
    }
}