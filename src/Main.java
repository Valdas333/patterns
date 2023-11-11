public class Main {

    public static void hashPrinter1(int size) {
        int tempSize = size;
        for (int i = 0; i < size; i++) {
            for (int j = tempSize; j > 0; j--) {
                System.out.print(" #");
            }
            System.out.println();
            tempSize -= 1;
        }
    }

    public static void hashPrinter2(int size) {
        int tempSize = size;
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = tempSize; j > 0; j--) {

                System.out.print(" #");
            }
            System.out.println();
            tempSize -= 1;
        }
    }

    public static void numberPrinter1(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print(" " + i);
            for (int j = i; j > 1; j--) {
                System.out.print(" " + (j - 1));
            }
            System.out.println();
        }
    }

    public static void numberPrinter2(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print(" " + z);
            }
            System.out.println();
        }
    }

    public static void squareHashPrint(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size * 2) - 1; j++) {
                if ((j % 2 != 0 && (i == size || i == 1)) || (i < size && i > 1 && j == 1 || j == (size * 2) - 1)) {
                    if (j == (size * 2) - 1) {
                        System.out.println("#");
                    } else {
                        System.out.print("#");
                    }
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void reversedZPrint() {
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 14; j++) {
                if ((i == 0 || i == 6) && j % 2 == 0) {
                    System.out.print("#");
                } else if (j == counter && i <= 5) {
                    System.out.println("#");
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            counter += 2;
            if (i == 0 || i == 6) {
                System.out.println();
            }
        }
    }

    public static void printX() {
        int counter = 2;
        int counterBackwards = 10;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                if ((i == 0 || i == 6) && j % 2 == 0) {
                    System.out.print("#");
                } else if (j == counter) {
                    System.out.print("#");
                } else if (j == counterBackwards) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i != 0 && i != 6) {
                counter += 2;
                counterBackwards -= 2;
            }
        }
    }

    public static void printSquaredX() {
        int counter = 2;
        int counterBackwards = 10;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                if ((i == 0 || i == 6) && j % 2 == 0 || j == 0 || j == 12) {
                    System.out.print("#");
                } else if (j == counter || j == counterBackwards) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            if (i != 0 && i != 6) {
                counter += 2;
                counterBackwards -= 2;
            }
            System.out.println();
        }
    }

    public static void numberPrinter() {

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 16; j++) {
                if (j == 8) {
                    System.out.print(" " + i);
                } else if (j >= (9 - i) && j <= 8) {
                    System.out.print(" " + ((j + i) - 8));
                } else if (j >= 8 && j <= 7 + i) {
                    System.out.print(" " + (8 - (j - i)));
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void numberPrinterV2() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 16; j++) {
                if (j == 8 && i == 8) {
                    System.out.print(" " + i);
                } else if (j <= i) {
                    System.out.print(" " + ((j + 1) - 1));
                } else if (j >= 16 - i) {
                    System.out.print(" " + ((15 - j) + 1));
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void numberPrinterV3() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 16; j++) {
                if (j >= 9 - i && j <= 8) {
                    System.out.print("  " + ((j + i) - 8));
                } else if (j >= 8 && j <= 7 + i) {
                    System.out.print("  " + (8 - (j - i)));
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    public static void numberPrinterV4() {
        int counter = 2;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 16; j++) {
                if (j >= 9 - i && j <= 8) {
                    if (((j + i) - 8) != 1 && ((j + i) - 8) != 2) { // jei ne 1 arba 2
                        counter *= 2;
                        if (counter < 10) {
                            System.out.print("   " + counter);
                        } else if (counter < 100) {
                            System.out.print("  " + counter);

                        } else {
                            System.out.print(" " + counter);
                        }
                    } else {
                        System.out.print("   " + ((j + i) - 8));
                    }

                } else if (((8 - (j - i)) == 1 && (8 - (j - i)) == 2)) {
                    System.out.print("  " + ((j + i) - 8));

                } else if (j >= 8 && j <= 7 + i) {
                    if ((8 - (j - i)) != 1 && (8 - (j - i)) != 2) { // jei ne 1 arba 2
                        counter /= 2;
                        if (counter < 10) {
                            System.out.print("   " + counter);
                        } else if (counter < 100) {
                            System.out.print("  " + counter);

                        } else {
                            System.out.print(" " + counter);
                        }
                    } else {
                        System.out.print("   " + (8 - (j - i)));
                    }
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
            counter = 2;
        }
    }


    public static void main(String[] args) {
        hashPrinter1(8);
        hashPrinter2(8);
        numberPrinter1(8);
        numberPrinter2(8);
        squareHashPrint(8);
        reversedZPrint();
        printX();
        printSquaredX();
        numberPrinter();
        numberPrinterV2();
        numberPrinterV3();
        numberPrinterV4();

    }

}