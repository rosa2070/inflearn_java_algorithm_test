package sec08;

// 맞
public class Main02 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n % 2);
        }


    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        T.DFS(11);
    }


//
//    11
//    5   - 1
//    2   - 1
//    1   - 0
//    0   - 1
}
