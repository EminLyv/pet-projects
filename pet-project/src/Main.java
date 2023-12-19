public class Main {
    public static void main(String[] args) {
        Home FirstHome = new Home(43,false,"Yasamal");
        System.out.println(FirstHome.sahe);

        Home SecondHome = new Home();
        SecondHome.sahe = 37;
        SecondHome.bina = true;
        SecondHome.location = "Nesimi";
        System.out.println(SecondHome.sahe);
    }
}