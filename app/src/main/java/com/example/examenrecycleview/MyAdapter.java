package com.example.examenrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private  RepositorioOficio repo;
    private  LayoutInflater layoutInflater;

    public MyAdapter(Context context){
        repo = RepositorioOficio.getInstance();
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }



    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.simple_element_rcvw,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Oficio oficio = repo.get(position);
        holder.a.setText(oficio.getEdad());
        holder.b.setText(oficio.getNom());


    }

    @Override
    public int getItemCount() {
        return repo.getSize();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            a = itemView.findViewById(R.id.textViewNombre);
            b= itemView.findViewById(R.id.textViewedad);
        }
    }
}