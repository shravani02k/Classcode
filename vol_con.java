public class vol_con {
    public static void main(String[] args) {
        char ch = args[0].toLowerCase().charAt(0);
        if (ch =='a'  || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
            System.out.println("the char is a vowels");
        }
        else{
            System.out.println("the char is consonent");
        }
    }
}
