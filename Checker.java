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

    public Boolean threeByThreeCheck(ArrayList<ArrayList> grid){
        Boolean valid = true;

        return valid;
    }
}
