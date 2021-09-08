package com.aa.formulario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Ename, Elastname, Eage, Eaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ename = (EditText) findViewById(R.id.editname);
        Elastname = (EditText) findViewById(R.id.editlastname);
        Eage = (EditText) findViewById(R.id.editage);
        Eaddress = (EditText) findViewById(R.id.editaddress);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", Ename.getText().toString());
        outState.putString("lastname", Elastname.getText().toString());
        outState.putString("age", Eage.getText().toString());
        outState.putString("address", Eaddress.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Ename.setText(savedInstanceState.getString("name"));
        Elastname.setText(savedInstanceState.getString("lastname"));
        Eage.setText(savedInstanceState.getString("age"));
        Eaddress.setText(savedInstanceState.getString("address"));
    }
}