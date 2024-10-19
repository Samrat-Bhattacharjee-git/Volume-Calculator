package com.example.volume_calculater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class custom_shape_adapter extends ArrayAdapter<shape_arraylist_model> {
    Context context;
    ArrayList<shape_arraylist_model> arrayList;

    public custom_shape_adapter(@NonNull Context context,ArrayList<shape_arraylist_model> arrayList) {
        super(context, R.layout.shape_items,arrayList);
        this.context = context;
        this.arrayList = arrayList;
    }

    static class ViewHolder{
        ImageView shape_img;
        TextView shape_name;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        shape_arraylist_model planet_class=getItem(position);
        ViewHolder viewHolder ;
        final View result;

        if(convertView==null){
            viewHolder=new ViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.shape_items,parent,false);


            viewHolder.shape_img=(ImageView) convertView.findViewById(R.id.img);
            viewHolder.shape_name=(TextView) convertView.findViewById(R.id.shape_name);

            result=convertView;
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.shape_name.setText(planet_class.getShape_name());
        viewHolder.shape_img.setImageResource(planet_class.getShape_image());

        return result;
    }
}
