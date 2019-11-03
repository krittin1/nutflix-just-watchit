package cinema;

public class Seat {

    private int number;
    private String row;
    private boolean status ;

    public Seat(int number, String row, boolean status) {
        this.number = number;
        this.row = row;
        this.status = status;
    }


    public int getNumber() {
        return number;
    }

    public String getRow() {
        return row;
    }

   public boolean getStatus(){
        return status;
   }
}
