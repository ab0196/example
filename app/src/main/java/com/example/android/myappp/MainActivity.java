package com.example.android.myappp;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mMostraSnackbarButton;
    private CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, CoordText.class);
        startActivity(intent);

        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        mMostraSnackbarButton =(Button) findViewById(R.id.snackbar_button);
        mMostraSnackbarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Snackbar.make(mCoordinatorLayout,
                        "Essa é uma Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Fechar", new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                //Custom action
                            }
                        }).show();
            }
        });
    }
}
