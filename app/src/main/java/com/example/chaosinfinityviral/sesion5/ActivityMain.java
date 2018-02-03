package com.example.chaosinfinityviral.sesion5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ActivityMain extends AppCompatActivity {

    AutoCompleteTextView autocomplete = (AutoCompleteTextView)findViewById(R.id.main_activity_AutocompleteTV);
    protected Button limpiar;
    protected Toast guardar;

    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] librotes = getResources().getStringArray(R.array.libritos);
        limpiar= (Button) findViewById(R.id.buttonsend);
        limpiar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                alerta();
            }
        });

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,librotes);

        autocomplete.setThreshold(3);
        autocomplete.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.new_game:
                toString();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void limpiadito(View view) {
    }


    public void setLimpiar(){

    }


    public void alerta(){
        AlertDialog.Builder adb = new AlertDialog.Builder(context);

        adb.setMessage("Desea limpiar el contenido?");
        adb.setCancelable(false);
        adb.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                setLimpiar();
            }
        });
        adb.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = adb.create();
        alertDialog.show();
    }





}

