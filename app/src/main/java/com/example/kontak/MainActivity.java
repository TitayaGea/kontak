package com.example.kontak;

import android.app.AlertDialog;
import  android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import  android.os.Bundle;
import android.support.design.widget.FloatingButton;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivty extends AppCompatActivity {

    String[] daftar;
    ListView ListView01;
    Menu menu;
    protected Cursor cursor;
    DataHelper dbCenter:
    public static MainActivty ma:
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton btn=(FloatingActionButton) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(view arg0) {
                Intent inte = new Intent(packageContext: MainActivty.this, BuatBiodata.class);
                startActivity(inte);
            }
        });
        md= this;
        dbCenter = new DataHelper( context: this);
        RefreshList();
    }
    public void RefreshList(){
        SQLLiteDatabase db= dbCenter.getReaddableDatabase();
        cursor = db.rawQuery(sql "SELECT ' FROM biodata", selectionArgs: null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc"0; cc



    }
}
