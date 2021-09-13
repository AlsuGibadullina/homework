package com.company;

public class Loader {
    public static void main(String[] args) {
        Parser.checkNumberOfArguments(args.length);
        var val1 = Parser.parseIntOrError(args[0]);
        String operator = Parser.parseOperatorOrError(args[1]);
        var val2 = Parser.parseIntOrError(args[2]);
        System.out.println(Calculator.calculate(val1, operator, val2));
    }

}
