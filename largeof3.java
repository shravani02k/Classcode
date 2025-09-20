public class largeof3{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("the maximum of 3 is "+Math.max(a,Math.max(b,c)));
    }
}
