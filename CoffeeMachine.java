import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ioan on 11/12/17.
 */
public class CoffeeMachine extends  StateMachine {

    CoffeeMachine()
    {
        List<String> sectable;
        table=new HashMap<String, List<String>>();

        sectable = new ArrayList<String>();
        sectable.add("5 S1");
        sectable.add("10 S2");
        table.put("S0",sectable);

        sectable = new ArrayList<String>();
        sectable.add("5 S2");
        sectable.add("10 S3");
        table.put("S1",sectable);

        sectable = new ArrayList<String>();
        sectable.add("5 S3");
        sectable.add("10 S4");
        sectable.add("C10 S0");
        table.put("S2",sectable);

        sectable = new ArrayList<String>();
        sectable.add("C10 S1");
        sectable.add("C15 S0");
        table.put("S3",sectable);

        sectable = new ArrayList<String>();
        sectable.add("C10 S2");
        sectable.add("C15 S1");
        table.put("S4",sectable);

        sc="S0";
    }

    @Override
    public void transition(String actiune) {

        int sw=0;
        String temp;
        for(int i=0;(i<table.get(sc).size()) && (sw==0);i++) {
            int j=0;
            temp = "";
            temp.replaceAll("[^a-zA-Z0-9 ]", "");
            while (table.get(sc).get(i).charAt(j)!=' ') {
                temp = temp + table.get(sc).get(i).charAt(j);
                j++;
            }
            if(actiune.equals(temp)){
                j++;
                temp = "";
                temp.replaceAll("[^a-zA-Z0-9 ]", "");
                while (j<table.get(sc).get(i).length()) {
                    temp = temp + table.get(sc).get(i).charAt(j);
                    j++;
                }
                sc=temp;
                sw=1;
            }

        }
    }

    public String suma_actuala()
    {
        if(sc.equals("S0"))
            return "0";
        if(sc.equals("S1"))
            return "5";
        if(sc.equals("S2"))
            return "10";
        if(sc.equals("S3"))
            return "15";
        if(sc.equals("S4"))
            return "20";
        return null;
    }
}
