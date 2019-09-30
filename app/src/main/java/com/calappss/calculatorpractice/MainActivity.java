package com.calappss.calculatorpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.calappss.calculatorpractice.Calculatorcontroll.CalcControll;
import com.calappss.calculatorpractice.ModelCalc.CalculateNo;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private TextView tviews;
    private Button btn1, btn2, btn3, btn4, btn5,
            btn6, btn7, btn8, btn9, btn0, btnd, btnp, btndi, btnper, btnans, btnreset;
    int count = 0;
    String operate;
    CalcControll calc = new CalcControll();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tviews = findViewById(R.id.tviews);
        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btnd = findViewById(R.id.btnd);
        btnd.setOnClickListener(this);
        btnp = findViewById(R.id.btnp);
        btnp.setOnClickListener(this);
        btndi = findViewById(R.id.btndi);
        btndi.setOnClickListener(this);
        btnper = findViewById(R.id.btnper);
        btnper.setOnClickListener(this);
        btnreset = findViewById(R.id.btnreset);
        btnreset.setOnClickListener(this);
        btnans = findViewById(R.id.btnans);
        btnans.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn0:
                tviews.append("0");
                break;
            case R.id.btn1:
                tviews.append("1");
                break;
            case R.id.btn2:
                tviews.append("2");
                break;
            case R.id.btn3:
                tviews.append("3");
                break;
            case R.id.btn4:
                tviews.append("4");
                break;
            case R.id.btn5:
                tviews.append("5");
                break;
            case R.id.btn6:
                tviews.append("6");
                break;
            case R.id.btn7:
                tviews.append("7");
                break;
            case R.id.btn8:
                btn8.append("8");
                break;
            case R.id.btn9:
                tviews.append("9");
                break;
            case R.id.btnp:
                count++;
                if (count < 2) {

                    SetData(count);
                    operate = "plus";
                } else {
                    tviews.setError("only two time");
                }

                break;
            case R.id.btnper:
                count++;
                if (count < 2) {

                    SetData(count);
                    operate = "sub";
                } else {
                    tviews.setError("only two time");
                }
                break;
            case R.id.btndi:
                count++;
                if (count < 2) {

                    SetData(count);
                    operate = "di";
                } else {
                    tviews.setError("only two time");
                }

                break;
            case R.id.btnd:
                count++;
                if (count < 2) {

                    SetData(count);
                    operate = "mul";
                } else {
                    tviews.setError("only two time");
                }

                break;
            case R.id.btnans:
                CalculateNo cl = new CalculateNo();
                count++;
                SetData(count);
                if (operate.equalsIgnoreCase("plus")) {
                    tviews.setText(cl.add(calc));

                } else if (operate.equalsIgnoreCase("sub")) {
                    tviews.setText(cl.sub(calc));

                } else if (operate.equalsIgnoreCase("di")) {
                    tviews.setText(cl.divide(calc));

                } else if (operate.equalsIgnoreCase("mul")) {
                    tviews.setText(cl.mul(calc));

                }

                break;
            case R.id.btnreset:
                tviews.setText("");
                count = 0;
        }
    }

        public void SetData( int cou){

            if (!tviews.getText().toString().isEmpty()) {
                if (cou == 1) {
                    calc.setFirstNumber(Double.parseDouble(tviews.getText().toString()));
                    tviews.setText("");
                    return;
                } else if (cou == 2) {
                    calc.setSecondNumber(Double.parseDouble(tviews.getText().toString()));
                    tviews.setText("");
                    return;
                } else {
                    tviews.setError("only two time");
                    return;
                }
            } else {
                tviews.setError("please enter the number first");
                count--;
                return;

            }


        }
    }

