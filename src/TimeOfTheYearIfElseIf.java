public class TimeOfTheYearIfElseIf {
    public static void main(String[] args) {
        int month = 6;

        if(month<3 || month==12){
            System.out.println("Winter");
        } else if(month>2 && month<6){
            System.out.println("Spring");
        } else if (month>5 && month<9){
            System.out.println("Summer");
        } else if (month>8 && month<12){
            System.out.println("Fall");
        } else {
            System.out.println("month does not exist");
        }
    }
}
