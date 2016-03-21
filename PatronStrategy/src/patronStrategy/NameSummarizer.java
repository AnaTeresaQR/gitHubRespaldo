package patronStrategy;

/**
 * Clase estrategia que resume por nombre
 *
 * @author Ana Teresa
 */
public class NameSummarizer implements SummarizingStrategy {

    @Override
    public String summarize(Contact[] contactList) {
        String names = "";
        int counter = 0;
        String summarize = "Summarize:\n";
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null) {
                counter++;
                names += counter + " : " + contactList[i].getName() + "\n";
            } else {
                break; // sale del for
            }
        }
        return summarize + "There is " + counter + " names\n" + names;
    }

    @Override
    public String[] makeSummarizedList(Contact[] contactList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
