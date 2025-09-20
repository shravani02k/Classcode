public class month_noofdays {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch (n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("no. of days in "+ n+ "month is 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("no. of days in \"+ n+ \"month is 30");
                break;
            case 2:
                System.out.println("no of days in 2 nd month is 28");
                break;
            default:
                System.out.println("Only takes input from 1-12");
                 break;


        }
    }
}
