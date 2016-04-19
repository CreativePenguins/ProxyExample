/**
 * Created by Tyler on 4/18/16.
 */
public class IdleState implements PrinterState {

    Printer printer;

    public IdleState(Printer newPrinter){

        printer = newPrinter;
    }

    @Override
    public void requestPrint(int pages) {
        System.out.println("Print has been requested");
        if (printer.paperInMachine <= 0){
            System.out.println("Printer out of paper!");
            printer.setPrinterState(printer.getOutOfPaper());
            return;
        }
        else if (printer.inkLevel <= 0) {
            System.out.println("Printer is out of ink!");
            printer.setPrinterState(printer.getOutOfInk());
            return;
        }
        else {
            printer.setPrinterState(printer.getIdle());
            printer.printPaper(pages);
        }
        System.out.println("Print Completed");
    }

    @Override
    public void reloadInk() {
        System.out.println("Reloading ink to 1000");
        printer.setInkLevel(1000);
    }

    @Override
    public void reloadPaper() {
        System.out.println("Reloading paper to 500");
        printer.setPaperInMachine(500);
    }
}
