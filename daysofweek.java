public class daysofweek{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        switch(n){
            case 1:
                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is teusday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
            case 7:
                System.out.println("today is sunday");
                break;
            default:
                System.out.println("takes only input 1-7");
                break;
        }
    }
}
