public class Tests {
    public static void main(String[] args) {
        String board =
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, " +
                "1, 2, 3, 4, 5, 6, 7, 8, 9";
        String board2 =
                "1, 9, 8, 7, 6, 5, 4, 3, 2, " +
                "2, 1, 9, 8, 7, 6, 5, 4, 3, " +
                "3, 2, 1, 9, 8, 7, 6, 5, 4, " +
                "4, 3, 2, 1, 9, 8, 7, 6, 5, " +
                "5, 4, 3, 2, 1, 9, 8, 7, 6, " +
                "6, 5, 4, 3, 2, 1, 9, 8, 7, " +
                "7, 6, 5, 4, 3, 2, 1, 9, 8, " +
                "8, 7, 6, 5, 4, 3, 2, 1, 9, " +
                "9, 8, 7, 6, 5, 4, 3, 2, 1";

        String board3 =
                "6, 3, 9, 5, 7, 4, 1, 8, 2, " +
                "5, 4, 1, 8, 2, 9, 3, 7, 6, " +
                "7, 8, 2, 6, 1, 3, 9, 5, 4, " +
                "1, 9, 8, 4, 6, 7, 5, 2, 3, " +
                "3, 6, 5, 9, 8, 2, 4, 1, 7, " +
                "4, 2, 7, 1, 3, 5, 8, 6, 9, " +
                "9, 5, 6, 7, 4, 8, 2, 3, 1, " +
                "8, 1, 3, 2, 9, 6, 7, 4, 5, " +
                "2, 7, 4, 3, 5, 1, 6, 9, 8";

        Board b1 = new Board(board3);
        //b1.printGrid();
        Checker ch1 = new Checker();
        System.out.println(ch1.process(b1.getGrid()));
    }
}
