/**
 * Created by Tyler on 4/18/16.
 */
public class PrinterProxy implements GetPrinterInfo {
    @Override
    public PrinterState getPrinterState() {
        Printer printer = new Printer();

        return printer.getPrinterState();
    }

    @Override
    public int getPaperInMachine() {
        Printer printer = new Printer();

        return printer.getPaperInMachine();
    }

    @Override
    public int getInkLevel() {
        Printer printer = new Printer();

        return printer.getInkLevel();
    }
}
