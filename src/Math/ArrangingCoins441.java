package Math;

public class ArrangingCoins441 {
    //NON_MATH
    public static int arrangeCoinsNonMath(int n) {
        int row = 1, res = 0;
        while (n >= row) {
            n -= row;
            res++;
            row++;
        }
        return res;
    }
    //MATH
    public static int arrangeCoinsMath(int n) {
        return (int)(-1 + (Math.sqrt(1 + 8 * (long)n )))/2;
    }
}