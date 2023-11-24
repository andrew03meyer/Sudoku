import java.util.ArrayList;
import java.util.HashMap;
public class Checker {
    public Boolean horizontalCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;

        //vertical Check
        for(ArrayList<Integer> row:grid){
            HashMap hm1 = new HashMap();
            for(Integer value: row){
                if(!hm1.containsKey(value)){
                    hm1.put(value, 1);
                }
                else{
                    valid = false;
                }
            }
        }

        //Print validity
        if(valid){
            System.out.println("This is horizontally valid");
        }
        else{
            System.out.println("This is horizontally not valid");
        }
        return valid;
    }

    public Boolean verticalCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;

        //vertical check
        for(int x = 0; x < grid.size(); x++){
            HashMap hm1 = new HashMap();
            for(int y = 0; y < grid.get(x).size(); y++){
                if(!hm1.containsKey(grid.get(y).get(x))){
                    hm1.put(grid.get(y).get(x), 1);
                }
                else{
                    valid = false;
                }
            }
        }

        //print validity
        if(valid){
            System.out.println("This is vertically valid");
        }
        else{
            System.out.println("This is vertically not valid");
        }
        return valid;
    }

    public Boolean threeByThreeCheck(ArrayList<ArrayList<Integer>> grid){
        Boolean valid = true;
        ArrayList<ArrayList<Integer>> array1 = new ArrayList<ArrayList<Integer>>();

        //(0-2,0-2)
        for(int row = 0; row < 3; row++) {
            ArrayList<Integer> col1 = new ArrayList<Integer>();

            for (int col1Index = 0; col1Index < 3; col1Index++) {
                col1.add(grid.get(row).get(col1Index));
            }
            array1.add(col1);
        }

        //(0-2,3-5)
        for(int row = 0; row < 3; row++) {
            ArrayList<Integer> col1 = new ArrayList<Integer>();

            for (int col1Index = 3; col1Index < 6; col1Index++) {
                col1.add(grid.get(row).get(col1Index));
            }
            array1.add(col1);
        }

        //(0-2,5-8)
        for(int row = 0; row < 3; row++) {
            ArrayList<Integer> col1 = new ArrayList<Integer>();

            for (int col1Index = 6; col1Index < 9; col1Index++) {
                col1.add(grid.get(row).get(col1Index));
            }
            array1.add(col1);
        }

        //(3-5, 0-2)
        for(int row=3; row < 6; row++) {
            ArrayList<Integer> col2 = new ArrayList<Integer>();

            for (int col2Index = 0; col2Index < 3; col2Index++) {
                col2.add(grid.get(row).get(col2Index));
            }
            array1.add(col2);
        }

        //(3-5, 3-5)
        for(int row=3; row < 6; row++) {
            ArrayList<Integer> col2 = new ArrayList<Integer>();

            for (int col2Index = 3; col2Index < 6; col2Index++) {
                col2.add(grid.get(row).get(col2Index));
            }
            array1.add(col2);
        }

        //(3-5, 5-8)
        for(int row=3; row < 6; row++) {
            ArrayList<Integer> col2 = new ArrayList<Integer>();

            for (int col2Index = 0; col2Index < 3; col2Index++) {
                col2.add(grid.get(row).get(col2Index));
            }
            array1.add(col2);
        }

        //(5-8, 0-2)
        for(int row=6; row < 9; row++){
            ArrayList<Integer> col3 = new ArrayList<Integer>();
            for(int col3Index=0; col3Index<3; col3Index++){
                col3.add(grid.get(row).get(col3Index));
            }
            array1.add(col3);
        }

        //(5-8, 3-5)
        for(int row=6; row < 9; row++){
            ArrayList<Integer> col3 = new ArrayList<Integer>();
            for(int col3Index=3; col3Index<6; col3Index++){
                col3.add(grid.get(row).get(col3Index));
            }
            array1.add(col3);
        }

        //(5-8, 6-8)
        for(int row=6; row < 9; row++){
            ArrayList<Integer> col3 = new ArrayList<Integer>();
            for(int col3Index=6; col3Index<9; col3Index++){
                col3.add(grid.get(row).get(col3Index));
            }
            array1.add(col3);
        }

        for(ArrayList<Integer> integerList: array1) {
            for (Integer value : integerList) {
                System.out.print(value);
            }
            System.out.println("\n");
        }
        //Board b2 = new Board(array1);
        //b2.printGrid();

        return valid;
    }
}
