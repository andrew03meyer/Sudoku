import java.util.ArrayList;
import java.util.HashMap;
public class Checker {
    public Boolean horizontalCheck(ArrayList<ArrayList> grid){
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

    public Boolean verticalCheck(ArrayList<ArrayList> grid){
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

    public Boolean threeByThreeCheck(ArrayList<ArrayList> grid, Boolean valid){
        if(grid.size() == 2){
            Boolean hBool = horizontalCheck(grid);
            Boolean vBool = verticalCheck(grid);
            if(hBool && vBool){valid = true;}
            valid = false;

        }
        else {
            ArrayList<ArrayList> arr1 = new ArrayList<ArrayList>(grid.subList(0, 2));
            ArrayList<ArrayList> arr2 = new ArrayList<ArrayList>(grid.subList(2, 4));
            ArrayList<ArrayList> arr3 = new ArrayList<ArrayList>(grid.subList(4, 6));
            ArrayList<ArrayList> arr4 = new ArrayList<ArrayList>(grid.subList(6, 8));
            System.out.println("arr1: " + arr1.size());
            System.out.println("arr2: " + arr2.size());
            System.out.println("arr3: " + arr3.size());
            System.out.println("arr4: " + arr4.size());
            threeByThreeCheck(arr1, valid);
            threeByThreeCheck(arr2, valid);
            threeByThreeCheck(arr3, valid);
            threeByThreeCheck(arr4, valid);
        }
        return valid;
    }
}
