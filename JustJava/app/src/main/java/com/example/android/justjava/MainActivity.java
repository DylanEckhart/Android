package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    /** This app displays an order form to order coffee. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** This method is called when the + button is clicked. */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /** This method is called when the - button is clicked. */
    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    /** This method is called when the order button is clicked. */
    public void submitOrder(View view) {
        String priceMessage = "Free";
        displayMessage(priceMessage);
    }

    /** This method displays the given text on the screen. */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /** This method displays the given quantity value on the screen. */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /** This method displays the given price on the screen. */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}