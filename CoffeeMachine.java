import java.util.HashMap;

/**
 * Created by ioan on 11/12/17.
 */
public class CoffeeMachine extends StateMachine {

    CoffeeMachine()
    {
        HashMap sectable = new HashMap();
        table=new HashMap();

        sectable.put("5","S1");
        sectable.put("10","S2");
        table.put("S0",sectable);

        sectable = new HashMap();
        sectable.put("5","S2");
        sectable.put("10","S3");
        table.put("S1",sectable);

        sectable = new HashMap();
        sectable.put("5","S3");
        sectable.put("10","S4");
        sectable.put("C10","S0");
        table.put("S2",sectable);

        sectable = new HashMap();
        sectable.put("C10","S1");
        sectable.put("C15","S0");
        table.put("S3",sectable);

        sectable = new HashMap();
        sectable.put("C10","S2");
        sectable.put("C15","S1");
        table.put("S4",sectable);

        sc="S0";
    }

    @Override
    protected void transition(String actiune) {

    }
}
