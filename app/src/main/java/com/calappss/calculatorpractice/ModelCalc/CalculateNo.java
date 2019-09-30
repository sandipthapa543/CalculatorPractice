package com.calappss.calculatorpractice.ModelCalc;

import com.calappss.calculatorpractice.Calculatorcontroll.CalcControll;

public class CalculateNo  implements CalcAction{

    @Override
    public String add(CalcControll n) {
        String add= (String.valueOf((n.getFirstNumber())+(n.getSecondNumber())));

        return add;
    }

    @Override
    public String sub(CalcControll n) {
        String sub= (String.valueOf((n.getFirstNumber())-(n.getSecondNumber())));

        return sub;
    }

    @Override
    public String divide(CalcControll n) {
        String divide= (String.valueOf((n.getFirstNumber())/(n.getSecondNumber())));

        return divide;
    }

    @Override
    public String mul(CalcControll n) {
        String mul= (String.valueOf((n.getFirstNumber())*(n.getSecondNumber())));

        return mul;
    }
}
