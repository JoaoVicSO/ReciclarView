package com.example.reciclarview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {
    List<Filme> listaFilmes;

    public  adapter(List<Filme> filmes) {
        this.listaFilmes = filmes;

    } // Fim Construtor

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo, ano, genero;

        public MyViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.TextViewIdTitulo);
            ano = itemView.findViewById(R.id.TextViewIdAno);
            genero = itemView.findViewById(R.id.TextViewIdGenero);

        }// Fim Construtor

    } // Fim class MyViewHolder

} // Fim class adapter
