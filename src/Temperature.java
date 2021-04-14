public class Temperature {
    public static void main(String[] args) {
        int temperature = -20;

        if (temperature>-5){
            System.out.println("heat");
        } else if (temperature<=-5 && temperature>-20){
            System.out.println("normally");
        } else if (temperature<=-20){
            System.out.println("cold");
        }
    }
}
