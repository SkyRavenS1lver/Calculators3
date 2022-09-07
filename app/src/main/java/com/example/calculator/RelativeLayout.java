package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RelativeLayout extends AppCompatActivity {
    EditText display1;
    EditText display2;
    Button add;
    Button subs;
    Button times;
    Button div;

    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        display1 = findViewById(R.id.display1);
        display2 =  findViewById(R.id.display2);
        results = findViewById(R.id.result);
        add = findViewById(R.id.add);
        subs = findViewById(R.id.substract);
        times = findViewById(R.id.times);
        div = findViewById(R.id.divide);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    results.setText(added(Integer.parseInt(autofilled(display1)),Integer.parseInt(autofilled(display2)))+"");
                }
                catch (NumberFormatException e){
                    results.setText(added(Double.parseDouble(autofilled(display1)),Double.parseDouble(autofilled(display2)))+"");
                }
            }
        });
        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    results.setText(subs(Integer.parseInt(autofilled(display1)),Integer.parseInt(autofilled(display2)))+"");
                }
                catch (NumberFormatException e){
                    results.setText(subs(Double.parseDouble(autofilled(display1)),Double.parseDouble(autofilled(display2)))+"");
                }
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    results.setText(times(Integer.parseInt(autofilled(display1)),Integer.parseInt(autofilled(display2)))+"");
                }
                catch (NumberFormatException e){
                    results.setText(times(Double.parseDouble(autofilled(display1)),Double.parseDouble(autofilled(display2)))+"");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                results.setText(divide(Double.parseDouble(autofilled(display1)),Double.parseDouble(autofilled(display2)))+"");
            }
        });
    }
    public String autofilled(EditText disp1){
        String numb1 = disp1.getText().toString();
        if (numb1.equals("")){disp1.setText("0"); return "0";}
        else {return numb1;}
    }
    public double added(double x, double y)
    {return x+y;}
    public int added(int x, int y)
    {return x+y;}
    public double subs(double x, double y)
    {return x-y;}
    public int subs(int x, int y)
    {return x-y;}
    public double times(double x, double y)
    {return x*y;}
    public int times(int x, int y)
    {return x*y;}
    public double divide(double x, double y)
    {return x/y;}

}