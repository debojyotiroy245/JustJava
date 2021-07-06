package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int number;
    public int quantity=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        TextView displayTextView = (TextView) findViewById(R.id.display_text_view);

        if(quantity==100)
        {

            displayTextView.setTextColor(Color.RED);
            displayTextView.setText("Maximum number of order reached");
        }
        else
        {
            quantity = quantity + 1;
            display(quantity);
            displayPrice(quantity*5);
            displayTextView.setText("");
        }

    }

    public void decrement(View view){
        TextView displayTextView = (TextView) findViewById(R.id.display_text_view);
        if(quantity==1)
        {

            displayTextView.setTextColor(Color.RED);
            displayTextView.setText("Minimum number of order reached");
        }
        else
        {
            quantity = quantity - 1;
            display(quantity);
            displayPrice(quantity * 5);
            displayTextView.setText("");
        }
    }

    public void submitOrder(View view){
        TextView displayTextView = (TextView) findViewById(R.id.display_text_view);
        displayTextView.setTextColor(Color.GREEN);
        displayTextView.setText("Order Successul");
    }

    private void display(int number){
        this.number = number;
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        this.number = number;
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}