package com.pacifico.villegas.DAO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pacifico.villegas.R;
import com.pacifico.villegas.bean.Cliente;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public ArrayList<Cliente>  ClienteLista;

    public RecyclerViewAdaptador(ArrayList<Cliente> ClienteLista){
        this.ClienteLista = ClienteLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cliente,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.codigo.setText(ClienteLista.get(position).getCod_afiliado());
        holder.nombre.setText(ClienteLista.get(position).getApellidos_nombres_concat());
    }

    @Override
    public int getItemCount() {
        return ClienteLista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView codigo,nombre;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            codigo = itemView.findViewById(R.id.tvCodigo);
            nombre = itemView.findViewById(R.id.tvNombre);
        }
    }

}
