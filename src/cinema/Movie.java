package cinema;

import java.io.Serializable;

public class Movie implements Serializable {

   private String name;
   private int length;
   private String category;

    public Movie(String name, int length, String category) {
        this.name = name;
        this.length = length;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int doubleLength(){
        return length * 2;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", category='" + category + '\'' +
                '}';
    }
}