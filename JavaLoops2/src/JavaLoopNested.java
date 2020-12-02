public class JavaLoopNested {
    static void output(int a, int b, int n){
        int s = a;
        int x = 1;
        String out = "";
        for (int i = 1; i <= n; i++) {
            s += b * x;
            out += s + " ";
            x *= 2;
        }
        System.out.println(out.trim());
    }
}
