public class Printer {

    public int paper;
    public int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int paper() {
        return this.paper;
    }

    public int print(int pages, int copies) {
        if (this.paper >= pages * copies) {
            return pages * copies;
        }
        else {
            return 0;
        }
    }

    public int toner(){
        return this.toner;
    }

    public int useToner(int pages) {
        return this.toner - pages;
    }

}
