package com.example.betta.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.betta.Entidades.Producto;
import com.example.betta.R;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Producto> arrayProducto;

    public ProductAdapter(Context context, ArrayList<Producto> arrayProducto) {
        this.context = context;
        this.arrayProducto = arrayProducto;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Producto> getArrayProducto() {
        return arrayProducto;
    }

    public void setArrayProducto(ArrayList<Producto> arrayProducto) {
        this.arrayProducto = arrayProducto;
    }

    @Override
    public int getCount() {
        return arrayProducto.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProducto.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.producto_template,null);

        Producto producto =arrayProducto.get(i);
        ImageView imgPez= (ImageView)  view.findViewById(R.id.imgPez);
        TextView textNombrePez = (TextView)  view.findViewById(R.id.textNombrePez);
        TextView textDescription = (TextView)  view.findViewById(R.id.textDescription);
        TextView textPrecio = (TextView)  view.findViewById(R.id.textPrecio);

        Button btnEditar = (Button)  view.findViewById(R.id.btnEditar);
        Button btnBorrar = (Button)  view.findViewById(R.id.btnBorrar);

        imgPez.setImageResource(R.drawable.dorado);
        textNombrePez.setText(producto.getName());
        textDescription.setText(producto.getDescription());
        textPrecio.setText(producto.getPrice());

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
}
