public class Printer {
    private int paper;
    private int toner = 100;

    public Printer(int paper) {
        this.paper = paper;
    }

    public int getPaper() { return paper;}
    public int getToner() {return toner;}


    public void printDocuments(int pages, int copies){
        int totalPagesToBePrinted = pages * copies;
        if (totalPagesToBePrinted < paper) {
        paper -= totalPagesToBePrinted;
        toner -= totalPagesToBePrinted;
        } else {System.out.println("Error, not enough paper");}

    }
}
