package main.function;


/*
         d(75) = 75+7+5 = 87
         생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다.
         {1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97}
         10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
         no input.
         1. 셀프넘버인 숫자들을 먼저 찾아서 어레이리스트에 담는다.
         2. 일부터 만까지의 for loop 으로 숫자들을 어레이리스트 숫자들과 비교한다.

9909 = 9

9010 = 9010+9+1 = 9020
 */
public class function_02_4673_selfNumber
{
    public static void main(String[] args)
    {
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001){
                check[n] = true;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if (!check[i]){
                System.out.println(i);
            }

        }
    }

    public static int d(int num)
    {
        int sum = num;

        while (num != 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}

/*
...
9903
9914
9925
9927
9938
9949
9960
9971
9982
9993
 */
