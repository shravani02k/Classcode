public class traficsig {
   public static void main(String[] args) {
    char ch =args[0].toLowerCase().charAt(0);
    switch(ch){
        case 'r':
            System.out.println("STOP");
            break;
        case 'y':
            System.out.println("STOP");
            break;
        case 'g':
            System.out.println("STOP");
            break;
        default:
            System.out.println("Only takes r'y'g as input");
        break;

    }
   }
}
