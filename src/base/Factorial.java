package base;

public class Factorial {

    public static void main(String[] args) {
        int res = factorial(10);
        System.out.println(res);
    }

    private static int factorial(int i) {

        /*
        4, 3, 2 , 1 순으로 트리를 그려보자, 노드가 가장 깊을 때부터 차례로 리턴값을 받아 스택에 남아있는 함수와 연산한다
         */
        if (i == 1) {
            return i;
        }
        return factorial(i-1) * i;
    }
}
