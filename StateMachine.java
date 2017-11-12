import java.util.HashMap;

/**
 * Created by ioan on 11/12/17.
 */
public abstract class StateMachine {
    protected String sc;
    protected HashMap table;
    protected abstract void transition(String actiune);
}
