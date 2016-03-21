package patronStrategy;

/**
 * Clase estrategia que resume por cédulas
 *
 * @author Ana Teresa
 */
public class ScheduleSummarizer implements SummarizingStrategy {

    @Override
    public String summarize(Contact[] contactList) {
        String schedules = "";
        int counter = 0;
        String summarize = "Summarize:\n";
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null) {
                counter++;
                schedules += counter + " : " + contactList[i].getSchedule() + "\n";
            } else {
                break; // sale del for
            }
        }
        return summarize + "There is " + counter + " schedules\n" + schedules;
    }

    @Override
    public String[] makeSummarizedList(Contact[] contactList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
