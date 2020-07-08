/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1simulator;

import controller.controller;
import formula1simulator.Car;
import formula1simulator.Run;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

/**
 *
 * @author GustavoS
 */
public class FXMLDocumentController implements Initializable {

    controller sis = new controller();

    static float x = 0, y = 0, r = -15, flag = 0;
    public static float x_red_origin, y_red_origin, r_red_origin;
    static int fg = 0;
    progressBar pgb_red = new progressBar();
    progressBar pgb_yellow = new progressBar();
    mover_cars mv = new mover_cars();

    @FXML
    private ImageView weather_fog, weather_sun, weather_rain;

    @FXML
    private ImageView car_red, car_ylw;

    @FXML
    private ProgressBar fuel_car_red, fuel_car_yellow, fuel_car_green;

    @FXML

    private Label status_car_red, status_car_yellow, status_weather;

    @FXML
    private Label count_voltas, total_voltas;

    @FXML
    private Button car_Run;
    @FXML
    private TextArea textArea1, textArea2;

    @FXML
    void acaodoBotaoRun(ActionEvent event) throws InterruptedException {
//        System.out.println("Controller aquii:" + sis.test());
//        setOrigin();
//        rodar();
//        fg = 1;;
          
       iniciarCorrida();
    }
    
    
    public void iniciarCorrida(){
        ArrayList<Car> cars = new ArrayList();
        cars.add(new Car("Ferrari", 1));
        cars.add(new Car("Williams", 1));
        
        Run run = new Run(cars, "malasia");
        textArea1.setText("Gustavo");
        
        while(!run.initRace()){;
            textArea1.appendText("Gustavion");
        };
    }

    public void rodar() {
        status_car_red.setText(sis.getCarStatus());
        status_car_yellow.setText(sis.getCarStatus());
        progressBar();
        carRed();
        carYellow();

    }

    public void progressBar() {
        pgb_red.diminuirFuel(0.025f);
        pgb_yellow.diminuirFuel(0.025f);

        //System.out.println("Valor-ProgressBar > RED: " + pgb_red.getValor() + "> GREEN:" + pgb_green.getValor() + "> Yellow: "+ pgb_yellow.getValor());
        fuel_car_red.setProgress(pgb_red.getValor());
        fuel_car_yellow.setProgress(pgb_yellow.getValor());

    }

    public void carRed() {

        car_red.setX(x);

        //Movimento positivo:
        if (x >= 250 && x <= 310 && flag == 0) {
            car_red.setY(y);

            if (y <= -1) {
                car_red.setRotate(r);
                if (r >= -90) {
                    r -= 15;
                } else if (r <= -90 && r >= -105) {
                    r -= 9;
                } else if (r <= -105 && r >= -130) {
                    r -= 10;
                }
            }

            if (y > -170) {
                y -= 13;
            }
        }

        System.out.println("Layout X : " + car_red.getX() + "Y: " + car_red.getY() + "Rot: " + car_red.getRotate());
        if (x <= 250 && flag == 0) {
            x += 25;
        } else if (x > 250 && x <= 310 && flag == 0) {
            x += 3;
        }

        if (x > 310 && flag == 0) {
            flag = 1;
            car_red.setRotate(-160);
            car_red.setY(-155);
            y = -155;
        }

        //Movimento Negativo: 
        if (x > 310 && flag == 1 || x <= 310 && flag == 1) {
            if (y > -160 && x >= -29 && y <= -8) {
                x -= 19;
                r -= 5;
                car_red.setRotate(r);
            } else if (x <= 0 && y <= -8 && flag == 1) {
                y += 7;
                r -= 5;
                x += 1.5;

                car_red.setRotate(r);
                car_red.setY(y);
                car_red.setX(x);
            } else if (y >= -8 && flag == 1) {
                x += 15;
                r -= 3;
                car_red.setRotate(r);
                car_red.setY(y);
                car_red.setX(x);
                if (y == -1.0 && x >= -6.0) {
                    flag = 3;
                }
            }

        }

        if (flag == 3) {
            System.out.println("entrou");
            pgb_red.setValor(1.0f);
            car_red.setX(8.0);
            car_red.setY(0.0);
            car_red.setRotate(r_red_origin);
            x = x_red_origin;
            y = y_red_origin;
            r = r_red_origin;
            flag = 0;

        }

    }

    public void carYellow() {

        if (x > 135 && x < 310) {
            car_ylw.setX(x - 15);
        } else {
            car_ylw.setX(x);
        }

        //Movimento positivo:
        if (x >= 250 && x <= 310 && flag == 0) {
            car_ylw.setY(y);

            if (y <= -1) {
                car_ylw.setRotate(r);
                if (r >= -90) {
                    r -= 15;
                } else if (r <= -90 && r >= -105) {
                    r -= 9;
                } else if (r <= -105 && r >= -130) {
                    r -= 10;
                }
            }

            if (y > -170) {
                y -= 13;
            }
        }

        System.out.println("Yellow - X : " + car_ylw.getX() + "Y: " + car_ylw.getY() + "Rot: " + car_ylw.getRotate());
        if (x <= 250 && flag == 0) {
            x += 25;
        } else if (x > 250 && x <= 310 && flag == 0) {
            x += 3;
        }

        if (x > 310 && flag == 0) {
            flag = 1;
            car_ylw.setRotate(-160);
            car_ylw.setY(-155);
            y = -155;
        }

        //Movimento Negativo: 
        if (x > 310 && flag == 1 || x <= 310 && flag == 1) {
            if (y > -160 && x >= -29 && y <= -8) {
                x -= 19;
                r -= 5;
                car_ylw.setRotate(r);
            } else if (x <= 0 && y <= -8 && flag == 1) {
                y += 7;
                r -= 5;
                x += 1.5;

                car_ylw.setRotate(r);
                car_ylw.setY(y);
                car_ylw.setX(x);
            } else if (y >= -8 && flag == 1) {
                x += 15;
                r -= 3;
                car_ylw.setRotate(r);
                car_ylw.setY(y);
                car_ylw.setX(x);
                if (y == -1.0 && x >= -6.0) {
                    flag = 3;
                }
            }

        }

        //Flag - contador de volta:  
        if (flag == 3) {
            System.out.println("entrou");
            car_ylw.setX(0.0);
            car_ylw.setY(0.0);
            car_ylw.setRotate(r_red_origin);
            x = x_red_origin;
            y = y_red_origin;
            r = r_red_origin;
            flag = 0;
            pgb_yellow.setValor(1.0f);
            pgb_red.setValor(1.0f);
            sis.countVoltas(0);
            count_voltas.setText(String.valueOf(sis.getCount()));
            //changeWeather();
        }

    }

    public void startWeather() {
        this.weather_sun.setVisible(false);
        this.weather_rain.setVisible(false);
        this.weather_fog.setVisible(false);
    }

    public void changeWeather(String weather) {

        switch (weather) {

            case "Chuva":
                this.weather_sun.setVisible(false);
                this.weather_rain.setVisible(false);
                this.weather_fog.setVisible(true);
                if (this.weather_fog.isVisible()) {
                    status_weather.setText("Chuva");
                }
                break;

            case "Neblina":
                this.weather_rain.setVisible(false);
                this.weather_fog.setVisible(false);
                this.weather_sun.setVisible(true);
                if (this.weather_sun.isVisible()) {
                    status_weather.setText("Neblina");
                }
                break;

            case "Chuva com granizo":
                this.weather_fog.setVisible(false);
                this.weather_sun.setVisible(false);
                this.weather_rain.setVisible(true);
                if (this.weather_rain.isVisible()) {
                    status_weather.setText("Chuva com granizo");
                }
                break;
        }

    }

    public void setOrigin() {
        if (fg == 0) {
            x_red_origin = (float) car_red.getX();
            y_red_origin = (float) car_red.getY();
            r_red_origin = (float) car_red.getRotate();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        changeWeather("Chuva com granizo");

        

    }

}
