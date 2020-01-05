package com.pacifico.villegas;
//1° importo esta clase
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

//2° Extendemos la clase SQliteOpenHelper (Heredamos) y luego implementamos sus metodos y su constructor
public class AminSqLite extends SQLiteOpenHelper{


    public AminSqLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tb_sunat ()");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
