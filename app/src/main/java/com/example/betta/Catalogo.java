package com.example.betta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.betta.Adaptadores.ProductAdapter;
import com.example.betta.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProducts;
    private ArrayList<Producto> arrayProductos;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);


        listViewProducts =(ListView)  findViewById(R.id.listViewProductos);
        arrayProductos = new ArrayList<>();

        Producto producto1=new Producto("Prod1","Desc Dorado","1000","","","");
        Producto producto2=new Producto("Prod1","Desc Dorado","1000","","","");
        Producto producto3=new Producto("Prod1","Desc Dorado","1000","","","");
        Producto producto4=new Producto("Prod1","Desc Dorado","1000","","","");
        Producto producto5=new Producto("Prod1","Desc Dorado","1000","","","");

        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);
        arrayProductos.add(producto5);

        productAdapter = new ProductAdapter(this, arrayProductos);
        listViewProducts.setAdapter(productAdapter);
    }
}