package cinema;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Threatre2_18_00Controller extends Threatre1Controller {
    @FXML
    ImageView A1,A2,A3,A4,A5,A6,A7,A8;

    @FXML
    ImageView B1,B2,B3,B4,B5,B6,B7,B8;

    @FXML
    ImageView C1,C2,C3,C4,C5,C6,C7,C8;

    @FXML
    ImageView D1,D2,D3,D4,D5,D6,D7,D8;

    @FXML
    Button confirm;


    private List<Seat> seats = new ArrayList<>();
    private String filename  = "BookingData2_18_00.csv";
    private int count=0;



    public void initialize() throws IOException{

        File file = new File("BookingData2_18_00.csv");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("check2_18_00.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        loadCheck();


        seats.add(new Seat("A1",450,A1,0));
        seats.add(new Seat("A2",450,A2,0));
        seats.add(new Seat("A3",450,A3,0));
        seats.add(new Seat("A4",450,A4,0));
        seats.add(new Seat("A5",450,A5,0));
        seats.add(new Seat("A6",450,A6,0));
        seats.add(new Seat("A7",450,A7,0));
        seats.add(new Seat("A8",450,A8,0));

        seats.add(new Seat("B1",450,B1,0));
        seats.add(new Seat("B2",450,B2,0));
        seats.add(new Seat("B3",450,B3,0));
        seats.add(new Seat("B4",450,B4,0));
        seats.add(new Seat("B5",450,B5,0));
        seats.add(new Seat("B6",450,B6,0));
        seats.add(new Seat("B7",450,B7,0));
        seats.add(new Seat("B8",450,B8,0));

        seats.add(new Seat("C1",450,C1,0));
        seats.add(new Seat("C2",450,C2,0));
        seats.add(new Seat("C3",450,C3,0));
        seats.add(new Seat("C4",450,C4,0));
        seats.add(new Seat("C5",450,C5,0));
        seats.add(new Seat("C6",450,C6,0));
        seats.add(new Seat("C7",450,C7,0));
        seats.add(new Seat("C8",450,C8,0));

        seats.add(new Seat("D1",450,D1,0));
        seats.add(new Seat("D2",450,D2,0));
        seats.add(new Seat("D3",450,D3,0));
        seats.add(new Seat("D4",450,D4,0));
        seats.add(new Seat("D5",450,D5,0));
        seats.add(new Seat("D6",450,D6,0));
        seats.add(new Seat("D7",450,D7,0));
        seats.add(new Seat("D8",450,D8,0));

        if (count == 0 ) {
            addData(seats);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine())!=null){
                String [] dataFile = line.split(",");
                String numberFile = dataFile[0];
                double priceFile = Double.parseDouble(dataFile[1]);
                int statusFile = Integer.parseInt(dataFile[2]);
                seats.get(i).setSeat(numberFile,priceFile,statusFile);
                int temp = i;
                seats.get(i).getImage().setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        seats.get(temp).book();
                    }
                });
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeCheck() throws IOException {
        Path path = Paths.get("check2_18_00.txt");
        FileWriter fileWriter = null;
        fileWriter = new FileWriter("check2_18_00.txt", true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        try {



            bw.write("1");
            bw.newLine();

        }

        finally {
            if(bw != null) {
                bw.close();
            }
        }
    }



    public void loadCheck() throws IOException {

        Path path = Paths.get("check2_18_00.txt");
        BufferedReader br = Files.newBufferedReader(path);
        String input;

        try {
            while ((input = br.readLine()) != null) {
                this.count = Integer.parseInt(input);

            }
        }

        finally {
            if(br != null) {
                br.close();
            }
        }
    }

    public void addData(List<Seat> seats) throws IOException {




        Path path = Paths.get(filename);
        FileWriter fileWriter;
        fileWriter = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        try {


            for (Seat i : seats){
                bw.write(i.getNumber()+","+i.getPrice()+","+i.getStatus());
                bw.newLine();
            }

        } finally {
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }




    public void confirmBtn() throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("THANK YOU!");
        alert.setHeaderText("Thank you for watching.our movies!\n" +
                " We hope to you get satisfy for the content we produce.");
        alert.setContentText("You book success");
        Optional<ButtonType> result = alert.showAndWait();

        storeBook();
    }

    public void goHomeFromThreatre1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("homepage.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void goBackFromThreatre1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie1.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goBackToMvie2(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie2.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void storeBook() throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            String line;
            String keep="";
            String temp="";
            double price =00.0;
            for (Seat i : seats) {
                if (i.getStatus() == 1) {
                    keep +=  "-" +i.getNumber();
                    price = price+i.getPrice();

                    line = i.getNumber() + "," + i.getPrice() + "," + 2 + "\n";
                    i.setSeat(i.getNumber(), i.getPrice(), 2);




                    writeCheck();
                } else {
                    line = i.getNumber() + "," + i.getPrice() + "," + i.getStatus() + "\n";

                }
                bw.write(line);

            }
            System.out.println(keep);
            temp += price;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ticket reserves");
            alert.setHeaderText("Please keep this ticket(**Recommend the member to take photos of the slip \n" +
                    "to prevent color fading) and Reservation Code \n" +
                    "in order to collect the ticket(s) \n" +
                    "and preventing fraud.");
            alert.setContentText("You book success"+keep+"price "+temp);
            Optional<ButtonType> result = alert.showAndWait();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


