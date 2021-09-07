package com.company;

public class Main {
    public static void main(String[] args) {

        if (args.length < 3){
            System.out.println("Ars format is: var1 +|-|/|* var2");
            System.exit(1);
            return;
        }

        var isVar1Int = isInt(args[0]);
        if (!isVar1Int){
            System.out.println("Var1 is not int");
            System.exit(2);
            return;
        }
        var isVar2Int = isInt(args[2]);
        if (!isVar2Int){
            System.out.println("Var2 is not int");
            System.exit(2);
            return;
        }
        var var1 = Integer.parseInt(args[0]);
        var operator = args[1];
        var var2 = Integer.parseInt(args[2]);
        var result = switch (operator) {
            case "-" -> var1 - var2;
            case "+" -> var1 + var2;
            case "/" -> var1 / var2;
            case "*" -> var1 * var2;
            default -> 0;
        };

        System.out.println("Result is: "   + result);

    }

    private static boolean isInt(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
