package cinema;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Seat {

    private String number;
    private double price;
    private ImageView image;
    private int status ;

    private String people = "images/single-user-yellow-hi.png";
    private String seat = "images/sofa__chair__interior__furniture__seat-512.png";
    private String choose = "images/check-mark-computer-icons-clip-art-green-tick.png";

    public Seat(String number,double price,ImageView image, int status) {
        this.number = number;
        this.price = price;
        this.image = image;
        this.status = status;
    }

    public void  setSeat(String number, double price, int status){
        this.number = number;
        this.price = price;
        this.status = status;
        setImage(this.status);
    }

    public void book(){
        if (status == 0){
            status = 1;
            image.setImage(new Image(choose));

        }
        else if (status == 1){
            status = 0;
            image.setImage((new Image(seat)));

        }
    }



    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

   public int getStatus(){
        return status;
   }

    public ImageView getImage() {
        return image;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(int status) {
        if (status == 0){
            image.setImage(new Image(seat));
        }
        else if(status == 2){
            image.setImage(new Image(people));
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
