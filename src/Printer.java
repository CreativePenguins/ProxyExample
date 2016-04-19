/**
 * Created by Tyler on 4/18/16.
 */
public class Printer implements GetPrinterInfo {

    PrinterState idle;
    PrinterState outOfInk;
    PrinterState outOfPaper;

    PrinterState printerState;

    int paperInMachine = 500;
    int inkLevel = 1000; // For simplicity each cartridge can print 1000 pages.

    public Printer (){
        idle = new IdleState(this);
        outOfInk = new NoInkState(this);
        outOfPaper = new NoPaperState(this);

        printerState = idle;

        if (paperInMachine == 0)
            printerState = outOfPaper;
        if (inkLevel == 0)
            printerState = outOfInk;
        }

    void setPrinterState(PrinterState newPrinterState){
        printerState = newPrinterState;
    }
    public void setPaperInMachine(int newPaperCount){
        paperInMachine = newPaperCount;
    }
    public void setInkLevel(int newInkLevel) {
        inkLevel = newInkLevel;
    }

    public void printPaper(int paperCount){
        paperInMachine =- paperCount;
        inkLevel =- paperCount;
    }

    public void reloadInk() {printerState.reloadInk();}
    public void reloadPaper() {printerState.reloadPaper();}
    public void requestPrint(int pages) {printerState.requestPrint(pages);}



    public PrinterState getIdle(){return idle;}
    public PrinterState getOutOfInk(){return outOfInk;}
    public PrinterState getOutOfPaper(){return outOfPaper;}


    @Override
    public PrinterState getPrinterState() {
        return printerState;
    }

    @Override
    public int getPaperInMachine() {
        return paperInMachine;
    }

    @Override
    public int getInkLevel() {
        return inkLevel;
    }
}
