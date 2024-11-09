package io.codeforall.fanstatics;

import java.util.stream.IntStream;
public class PerfectNumber {

    public int sumDivisors(int n){
        int root = (int) Math.sqrt(n);
        int sum = IntStream.range(2, root + 1) // get a stream up to the square root of n
                .filter(x -> n % x == 0) // check divisors
                .map(x -> x + n / x) // sum the divisor with its "pair"
                .sum();

        if(n == root * root){
            sum = sum - root;
        }
        return sum + 1;
    }

    public void checkPerfects(int limit){
        IntStream.iterate(1, n -> n + 1)
                .unordered()
                .filter(n -> n == sumDivisors(n))
                .parallel()
                .limit(limit)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.checkPerfects(5);

        double elapsed = (System.currentTimeMillis() - start) / 1000;
        System.out.println(elapsed < 60d ? "time (secs): " + elapsed : "time (mins): " + elapsed / 60);
    }
}