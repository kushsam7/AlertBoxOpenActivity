package com.example.labexpfour;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLR;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLR= findViewById(R.id.btnLR);




        btnLR.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);


                alertDialogBuilder.setTitle("Alert:Login/Registration");


                alertDialogBuilder
                        .setMessage("Open which you want")
                        .setCancelable(false)
                        .setPositiveButton("Login",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {

                              startActivity(new Intent(MainActivity.this,LoginActivity.class));
                            }
                        })
                        .setNegativeButton("Registration",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {

                                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();


                alertDialog.show();
            }
        });

    }
}
