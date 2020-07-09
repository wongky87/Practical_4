package com.example.practical_4;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String message = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMessage(View view) {
    choseTopping((CheckBox) findViewById(R.id.check_chocolate), getString(R.string.chocolate_syrup));
    choseTopping((CheckBox) findViewById(R.id.check_sprinkles), getString(R.string.sprinkles));
    choseTopping((CheckBox) findViewById(R.id.check_crushednuts), getString(R.string.crushed_nuts));
    choseTopping((CheckBox) findViewById(R.id.check_cherries), getString(R.string.cherries));
    choseTopping((CheckBox) findViewById(R.id.check_orio), getString(R.string.orio_cookie_crumble));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
}

    private void choseTopping(CheckBox checkBox, String topping){
        if (checkBox.isChecked()){
            if (!message.contains(topping)){
                message = message + " " + topping;
            }
        }
        else{
            if (message.contains(topping)){
                message = message.replace(" " + topping, "");
            }
        }
    }
}