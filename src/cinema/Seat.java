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
    private String kingSeat = "images/65-512.png";
    private String vip = "images/Retro_Vintage_Wedding_Love_Married_Bed-256.png";

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
        setImage(this.status,this.price);
    }

    public void book(){
        if (status == 0){
            status = 1;
            image.setImage(new Image(choose));

        }
        else if (status == 1){
            status = 0;
            image.setImage((new Image(seat)));
            if (price == 670 || price == 899){
                image.setImage((new Image(kingSeat)));
            }else if (price == 1599){
                image.setImage((new Image(vip)));
            }

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

    public void setImage(int status, double price) {

        if (price == 670 || price == 899) {
            if (status == 0) {
                image.setImage(new Image(kingSeat));
            } else if (status == 2) {
                image.setImage(new Image(people));
            }
        }else if (price ==  1599){
            if (status == 0) {
                image.setImage(new Image(vip));
            } else if (status == 2) {
                image.setImage(new Image(people));
            }
        }else{
            if (status == 2) {
                image.setImage(new Image(people));
            } else if (status == 0) {
                image.setImage(new Image(seat));
            }
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
