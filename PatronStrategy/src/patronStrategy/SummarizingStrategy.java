package patronStrategy;

/**
 * Clase con los métodos que implementan las estrategias
 *
 * @author Ana Teresa
 */
public interface SummarizingStrategy {

    public String summarize(Contact[] contactList);

    public String[] makeSummarizedList(Contact[] contactList);

}
