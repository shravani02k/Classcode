public class leap{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(num % 4==0){
            System.out.println("this is the leap year");
        }
        else{
            System.out.println("this year is not leap year");
        }
    }
}