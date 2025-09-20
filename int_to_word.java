public class int_to_word {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        switch(n){
            case 0:
                System.out.println(n +"->Zero");
                break;
            case 1:
                System.out.println(n +"->ONE");
                break;
            case 2:
                System.out.println(n +"->TWO");
                break;
            case 3:
                System.out.println(n +"->THREE");
                break;
            case 4:
                System.out.println(n +"->FOUR");
                break;
            case 5:
                System.out.println(n +"->FIVE");
                break;
            default:
                System.out.println("Only takes input from 0 to 5");
                break;
        }
    }
}
