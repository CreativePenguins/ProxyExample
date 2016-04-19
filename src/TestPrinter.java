/**
 * Created by Tyler on 4/18/16.
 */
public class TestPrinter {

    public static void main(String[] args){
        Printer printer = new Printer();

        printer.requestPrint(30);

        GetPrinterInfo printerProxy = new PrinterProxy();

        System.out.println("\n\t Current printer state: " + printerProxy.getPrinterState());
        System.out.println("\n\t Current paper in printer: " + printerProxy.getPaperInMachine());
        System.out.println("\n\t Current ink level: " + printerProxy.getInkLevel());
    }
}
