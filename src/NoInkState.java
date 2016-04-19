/**
 * Created by Tyler on 4/18/16.
 */
public class NoInkState implements PrinterState {

    Printer printer;

    public NoInkState(Printer newPrinter){

        printer = newPrinter;
    }

    @Override
    public void requestPrint(int pages) {
        System.out.println("Printer is out of ink. Please reload...");
    }

    @Override
    public void reloadInk() {
        System.out.println("Reloading ink to 1000");
        printer.setInkLevel(1000);
        printer.setPrinterState(printer.getIdle());
    }

    @Override
    public void reloadPaper() {
        System.out.println("Printer is out of ink. Please reload...");
    }
}
