package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class StringAdapter extends ArrayAdapter<String> {

    private int mResource;
    private int mTextViewResource;

    private LayoutInflater mLayoutInflater;
    private List<String> mItems = new ArrayList<String>();

    public StringAdapter(Context context, int resource, int textViewResource) {
        super(context, resource, textViewResource);

        mResource = resource;
        mTextViewResource = textViewResource;

        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mItems.add("Fuyang");
        mItems.add("Panda");
        mItems.add("Cub");
        mItems.add("Ethan");
    }

    //how many items in it
    @Override
    public int getCount() {
        return mItems.size();
    }


    //how is the item looks like
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = mLayoutInflater.inflate(mResource, null);
            viewHolder = new ViewHolder();
            viewHolder.itemTextView = (TextView) convertView.findViewById(mTextViewResource);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final String item = mItems.get(position);
        viewHolder.itemTextView.setText(item);

        return convertView;
    }

    static class ViewHolder {
        TextView itemTextView;

    }
}
