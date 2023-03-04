package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    String operation="";
    int result;
    boolean flag=false;
    int result2=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_input=findViewById(R.id.tv_userInput);
        TextView tv_result=findViewById(R.id.tv_userResult);
        Button btn_c=findViewById(R.id.btn_clear);
        Button btn_divide=findViewById(R.id.btn_divide);
        Button btn_multiply=findViewById(R.id.btn_multiply);
        Button btn_plus=findViewById(R.id.btn_plus);
        Button btn_mince=findViewById(R.id.btn_mince);
        Button btn_equle=findViewById(R.id.btn_equle);
        Button btn_dot=findViewById(R.id.btn_dot);
        Button btn_AC=findViewById(R.id.btn_AC);
        Button btn_one=findViewById(R.id.btn_1);
        Button btn_tow=findViewById(R.id.btn_2);
        Button btn_three=findViewById(R.id.btn_3);
        Button btn_four=findViewById(R.id.btn_4);
        Button btn_five=findViewById(R.id.btn_5);
        Button btn_six=findViewById(R.id.btn_6);
        Button btn_seven=findViewById(R.id.btn_7);
        Button btn_eight=findViewById(R.id.btn_8);
        Button btn_nine=findViewById(R.id.btn_9);
        Button btn_zero=findViewById(R.id.btn_0);

        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText("");
                tv_result.setText("");
                num1=0;
                num2=0;
                result=0;
                operation="";
            }
        });


        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation.equals("")) {
                    Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_SHORT).show();
                }else {
                    operation = operation.substring(0, operation.length() - 1);
                    tv_input.setText(operation);
                    flag = true;
                }
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"0";
                tv_input.setText(operation);
                flag=true;
            }
        });

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"1";
                tv_input.setText(operation);
                flag=true;
            }
        });
        btn_tow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"2";
                tv_input.setText(operation);
                flag=true;
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"3";
                tv_input.setText(operation);
                flag=true;
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"4";
                tv_input.setText(operation);
                flag=true;
            }
        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"5";
                tv_input.setText(operation);
                flag=true;
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"6";
                tv_input.setText(operation);
                flag=true;
            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"7";
                tv_input.setText(operation);
                flag=true;

            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"8";
                tv_input.setText(operation);
                flag=true;
            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=operation+"9";
                tv_input.setText(operation);
                flag=true;
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result==0) {
                    operation = operation + "+";
                    tv_input.setText(operation);
                    flag=true;
                }else {

                    tv_input.setText(String.valueOf(result2));
                    operation = result2 + "+";
                    tv_input.setText(operation);
                    flag=true;
                }
            }
        });
        btn_mince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result==0) {
                    operation = operation + "-";
                    tv_input.setText(operation);
                    flag=true;
                }else {

                    tv_input.setText(String.valueOf(result2));
                    operation = result2 + "-";
                    tv_input.setText(operation);
                    flag=true;
                }

            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result==0) {
                    operation = operation + "*";
                    tv_input.setText(operation);
                    flag=true;
                }else {

                    tv_input.setText(String.valueOf(result2));
                    operation = result2 + "*";
                    tv_input.setText(operation);
                    flag=true;
                }
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result==0) {
                    operation = operation + "/";
                    tv_input.setText(operation);
                    flag=true;
                }else {

                    tv_input.setText(String.valueOf(result2));
                    operation = result2 + "/";
                    tv_input.setText(operation);
                    flag=true;
                }
            }
        });


        btn_equle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag) {

                    if (operation.substring(operation.length() - 1).equals("*") || operation.substring(operation.length() - 1).equals("+")
                            || operation.substring(operation.length() - 1).equals("-") || operation.substring(operation.length() - 1).equals("/")) {

                        Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_SHORT).show();

                    } else {

                        if (operation.contains("*")) {
                            num1 = Integer.parseInt(operation.substring(0, operation.indexOf("*")));
                            num2 = Integer.parseInt(operation.substring(operation.indexOf("*") + 1));
                            result = num1 * num2;
                            tv_result.setText(String.valueOf(result));
                        } else if (operation.contains("+")) {
                            num1 = Integer.parseInt(operation.substring(0, operation.indexOf("+")));
                            num2 = Integer.parseInt(operation.substring(operation.indexOf("+") + 1));
                            result = num1 + num2;
                            tv_result.setText(String.valueOf(result));

                        } else if (operation.contains("-")) {
                            num1 = Integer.parseInt(operation.substring(0, operation.indexOf("-")));
                            num2 = Integer.parseInt(operation.substring(operation.indexOf("-") + 1));
                            result = num1 - num2;
                            tv_result.setText(String.valueOf(result));

                        } else if (operation.contains("/")) {
                            num1 = Integer.parseInt(operation.substring(0, operation.indexOf("/")));
                            num2 = Integer.parseInt(operation.substring(operation.indexOf("/") + 1));
                            if (num2 == 0) {
                                tv_input.setText("");
                                tv_result.setText("");
                                num1 = 0;
                                num2 = 0;
                                result = 0;
                                operation = "";
                                Toast.makeText(MainActivity.this, "The process is not allowed", Toast.LENGTH_SHORT).show();
                            } else {
                                result = num1 / num2;
                                tv_result.setText(String.valueOf(result));
                            }
                        }
                        result2 = result;
                    }

                }else {
                    Toast.makeText(MainActivity.this, "Try again", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}