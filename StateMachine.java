import java.util.HashMap;

/**
 * Created by ioan on 11/12/17.
 */
public abstract class StateMachine {
    protected String sc;
    protected HashMap<String,HashMap<String, String>> table;

    public void transition(String actiune){
        if (table.get(sc).get(actiune) != null) {
                sc = table.get(sc).get(actiune);
        }
    }

}
