public class Printer {

    private int numPagesLeft;
    private int tonerVolume;

    public Printer(int numPagesLeft, int toner){
        this.numPagesLeft = numPagesLeft;
        this.tonerVolume = toner;
    }

    public int getNumPagesLeft(){
        return this.numPagesLeft;
    }

    public int getToner(){
        return this.tonerVolume;
    }

    public void setNumPagesLeft(int newNum){
        this.numPagesLeft = newNum;
    }

    public void setToner(int newTonerVolume){
        this.tonerVolume = newTonerVolume;
    }

    public void print(int pages, int copies){
        int totalPages = copies*pages;
        if ((totalPages <= this.numPagesLeft) && totalPages <= this.tonerVolume){
            int newPagesLeft = this.numPagesLeft - totalPages;
            int newTonerVolume = this.tonerVolume - totalPages;
            this.setNumPagesLeft(newPagesLeft);
            this.setToner(newTonerVolume);
        }
    }
}
