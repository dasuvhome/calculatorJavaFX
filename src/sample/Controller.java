package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {



    @FXML
    private Label label_field;

    @FXML
    private Button ms_btn;

    @FXML
    private Button mc_btn;

    @FXML
    private Button mr_btn;

    @FXML
    private Button m_plus_btn;

    @FXML
    private Button m_minus_btn;

    @FXML
    private Button m_mult_btn;

    @FXML
    private Button nine_btn;

    @FXML
    private Button plus_minis_btn;

    @FXML
    private Button zero_btn;

    @FXML
    private Button dot_btn;

    @FXML
    private Button equals_btn;

    @FXML
    private Button one_btn;

    @FXML
    private Button two_btn;

    @FXML
    private Button three_btn;

    @FXML
    private Button plus_btn;

    @FXML
    private Button four_btn;

    @FXML
    private Button five_btn;

    @FXML
    private Button six_btn;

    @FXML
    private Button minus_btn;

    @FXML
    private Button seven_btn;

    @FXML
    private Button eight_btn;

    @FXML
    private Button mult_btn;

    @FXML
    private Button xz_btn;

    @FXML
    private Button x_btn;

    @FXML
    private Button vx_btn;

    @FXML
    private Button diff_btn;

    @FXML
    private Button percent_btn;

    @FXML
    private Button clear_btn;

    @FXML
    private Button c_btn;

    @FXML
    private Button back_btn;
    String str_num = "";
    String firstNumber = "";
    char operation = 'A';

    @FXML
    void initialize() {
//        zero_btn.setOnAction(event->{
//            addNumber(0);
//        });
//        one_btn.setOnAction(event->{
//            addNumber(1);
//        });
//        two_btn.setOnAction(event->{
//            addNumber(2);
//        });
//        three_btn.setOnAction(event->{
//            addNumber(3);
//        });
//        four_btn.setOnAction(event->{
//            addNumber(4);
//        });
//        five_btn.setOnAction(event->{
//            addNumber(5);
//        });
//        six_btn.setOnAction(event->{
//            addNumber(6);
//        });
//        seven_btn.setOnAction(event->{
//            addNumber(7);
//        });
//        eight_btn.setOnAction(event->{
//            addNumber(8);
//        });
//        nine_btn.setOnAction(event->{
//            addNumber(9);
//        });

        addNumber(one_btn, 1);
        addNumber(two_btn, 2);
        addNumber(three_btn, 3);
        addNumber(four_btn, 4);
        addNumber(five_btn, 5);
        addNumber(six_btn, 6);
        addNumber(seven_btn, 7);
        addNumber(eight_btn, 8);
        addNumber(nine_btn, 9);
        addNumber(zero_btn, 0);

        plus_btn.setOnAction(event ->{
            numbersOperation('+');
        });
        minus_btn.setOnAction(event ->{
            numbersOperation('-');
        });
        mult_btn.setOnAction(event ->{
            numbersOperation('*');
        });
        diff_btn.setOnAction(event ->{
            numbersOperation('/');
        });
        equals_btn.setOnAction(event ->{
             resultOperation();
        });

        c_btn.setOnAction(event ->{
            if(label_field.getText().equals("0") && str_num.equals("") && firstNumber.equals("")){
                label_field.setText("0");
            }
            str_num = "";
            firstNumber = "";
            label_field.setText("0");

        });


    }

    private void resultOperation() {
        int n1 = Integer.parseInt(firstNumber);
        int n2 = Integer.parseInt(str_num);
        int res = 0;
        if(operation == '+'){
             res = n1 + n2;
        label_field.setText(String.valueOf(res));
        }else if(operation == '-'){
            res = n1 - n2;
            label_field.setText(String.valueOf(res));
        }else if (operation == '*'){
            res = n1 * n2;
            label_field.setText(String.valueOf(res));
        }else {
            res = n1 / n2;
            label_field.setText(String.valueOf(res));
        }


    }

    private void numbersOperation(char operation) {
        firstNumber = str_num;
        this.operation = operation;
        label_field.setText(String.valueOf(operation));
        str_num = "";
    }

    void addNumber(Button button, int number){
        button.setOnAction(actionEvent -> {
            this.str_num +=Integer.toString(number);
        label_field.setText(str_num);

        });
    }
}
