package com.luv2tech.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        //TODO: Function Takes 1 Argument and produce 1 result
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementBOneFunction.apply(1);

        System.err.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementBOneFunction
                        .andThen(multiplyBy10Function)
                        .andThen(incrementBOneFunction);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        //TODO: Function Takes 2 Argument and produce 1 result

        System.out.println(incrementByOneAndMultiply(4,100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));


    }

    static Function<Integer, Integer> incrementBOneFunction =
            number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction
            = (numberToIncrementByOne, numberToMultiplyBy) ->
            (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
