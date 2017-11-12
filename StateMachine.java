import java.util.List;
import java.util.Map;

/**
 * Created by ioan on 11/12/17.
 */
public abstract class StateMachine {
    protected String sc;
    protected Map<String, List<String>> table;
    public abstract void transition(String actiune);
}
