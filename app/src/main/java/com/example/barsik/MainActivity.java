package com.example.barsik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Care = (Button) findViewById(R.id.Care);
        Button Nutrition = (Button) findViewById(R.id.Nutrition);
        Button Education =(Button) findViewById(R.id.Education);
        Button Aggression = (Button) findViewById(R.id.Aggression);
        Button Ill = (Button) findViewById(R.id.Ill);
        Button Address = (Button) findViewById(R.id.Address);
        Care.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CareActivity.class);
                startActivity(i);

            }
        });
        Nutrition.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,NutritionActivity.class);
                startActivity(i);

            }
        });
        Education.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,EducationActivity.class);
                startActivity(i);

            }
        });
        Aggression.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AggressionActivity.class);
                startActivity(i);

            }
        });
        Ill.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,IllActivity.class);
                startActivity(i);

            }
        });
        Address.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AddressActivity.class);
                startActivity(i);

            }
        });
    }


}
