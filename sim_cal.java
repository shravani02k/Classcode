public class sim_cal {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        char op = args[2].charAt(0);
        System.out.println(op);

        switch(op){
            case '+':
                System.out.println("ans ="+(a+b));
                break;
            case '-':
                System.out.println("ans ="+(a-b));
                break;
            case 'x':
                System.out.println("ans ="+(a*b));
                break;
            case '/':
            
                System.out.println("ans ="+(a/b));
           
                break; 
            default:
               System.out.println("Only takes input in 2 integers and an operand such as + for addition; - for subtraction; / for division; x for multiplication;");
        
        }
    }

}