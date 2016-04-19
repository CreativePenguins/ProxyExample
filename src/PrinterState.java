/**
 * Created by Tyler on 4/18/16.
 */
public interface PrinterState {

    void requestPrint(int pages);
    void reloadInk();
    void reloadPaper();

}
