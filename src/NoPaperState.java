/**
 * Created by Tyler on 4/18/16.
 */
public class NoPaperState implements PrinterState {

    Printer printer;

    public NoPaperState(Printer newPrinter){

        printer = newPrinter;
    }

    @Override
    public void requestPrint(int pages) {
        System.out.println("Printer is out of paper, please reload...");
    }

    @Override
    public void reloadInk() {
        System.out.println("Printer is out of paper, please reload...");
    }

    @Override
    public void reloadPaper() {
        System.out.println("Reloading paper to 500");
        printer.setPaperInMachine(500);
        printer.setPrinterState(printer.getIdle());
    }
}
