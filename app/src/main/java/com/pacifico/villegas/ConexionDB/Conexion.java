package com.pacifico.villegas.ConexionDB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.pacifico.villegas.Utilitarios.Constantes;

import androidx.annotation.Nullable;

public class Conexion extends SQLiteOpenHelper {

    //Cuando quiera llamar esta conexion en alguna clase tengo que llamar a este constructor que tiene los siguientes PARAMETROS:
    //EL CONTEXTO               (EL ACTIVITY) || NOMBRE BASE DE DATOS || ESTO ES NULL                               || LA VERSION DE NUESTRA BASE DE DATOS)
    public Conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constantes.CREAR_TABLA_1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Constantes.TABLA_1);
    }
}
