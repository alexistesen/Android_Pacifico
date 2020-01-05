package com.pacifico.villegas.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.pacifico.villegas.ConexionDB.Conexion;
import com.pacifico.villegas.Utilitarios.Constantes;
import com.pacifico.villegas.bean.Cliente;

import java.util.ArrayList;

public class ClienteDAO {

    private SQLiteDatabase sq;
    private Conexion con;

    public ClienteDAO(Context context){
        this.con = new Conexion(context, Constantes.DB_NAME,null,1);
    }

    public ArrayList<Cliente> Listado_Cod(String cod){
        return null;
    }

    public ArrayList<Cliente> Listado_DNI(String dni){
        return null;
    }

    public ArrayList<Cliente> Listado_Nom(String nombre){
        return null;
    }

}
