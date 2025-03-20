package sec08;

public class Main01 {
    public void DFS(int n) {
        if (n==0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Main01 T = new Main01();
        T.DFS(3);
    }
}
