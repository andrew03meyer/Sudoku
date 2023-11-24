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

        Board b1 = new Board(board2);
        b1.printGrid();
        Checker ch1 = new Checker();
        ch1.horizontalCheck(b1.getGrid());
        ch1.verticalCheck(b1.getGrid());
        ch1.threeByThreeCheck(b1.getGrid(), true);
    }
}
