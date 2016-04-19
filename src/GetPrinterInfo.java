/**
 * Created by Tyler on 4/18/16.
 */
public interface GetPrinterInfo {

    public PrinterState getPrinterState();
    public int getPaperInMachine();
    public int getInkLevel();
}
