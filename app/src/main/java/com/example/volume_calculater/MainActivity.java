package com.example.volume_calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import shapes.cube;
import shapes.cuboid;
import shapes.cylinder;
import shapes.sphere;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<shape_arraylist_model> shape_arrayList;

    static custom_shape_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.grid);
        shape_arrayList=new ArrayList<>();

        shape_arraylist_model sphere=new shape_arraylist_model(R.drawable.sphere,"SPHERE");
        shape_arraylist_model cylinder=new shape_arraylist_model(R.drawable.cylinder,"CYLINDER");
        shape_arraylist_model cube=new shape_arraylist_model(R.drawable.cube,"CUBE");
        shape_arraylist_model cuboid=new shape_arraylist_model(R.drawable.prism,"CUBOID");

        shape_arrayList.add(sphere);
        shape_arrayList.add(cylinder);
        shape_arrayList.add(cube);
        shape_arrayList.add(cuboid);

        adapter=new custom_shape_adapter(getApplicationContext(),shape_arrayList);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapter.getItem(i).getShape_name()=="SPHERE"){
                    gotosphere();
                }
                else if (adapter.getItem(i).getShape_name() == "CYLINDER") {
                    gotocylinder();
                }
                else if (adapter.getItem(i).getShape_name() == "CUBE") {
                    gotocube();
                }
                else if (adapter.getItem(i).getShape_name() == "CUBOID"){
                    gotocuboid();
                }
            }
        });


    }
    public void gotosphere(){
        Intent intent=new Intent(this, sphere.class);
        startActivity(intent);
    }
    public void gotocylinder(){
        Intent intent=new Intent(this, cylinder.class);
        startActivity(intent);
    }
    public void gotocube(){
        Intent intent=new Intent(this, cube.class);
        startActivity(intent);
    }
    public void gotocuboid(){
        Intent intent=new Intent(this, cuboid.class);
        startActivity(intent);
    }
}