public class pos_neg_zero {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num >= 0){
            System.out.println("nimber is positive");
            return;
        }
        if(num <=0){
            System.out.println("number is negative");
            return;
        }
        else{
            System.out.println("number is zero 0");
            return;
        }

    }
}
