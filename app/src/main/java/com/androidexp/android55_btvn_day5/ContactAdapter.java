package com.androidexp.android55_btvn_day5;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {

    private ArrayList<Contact> mListContact;

    public ContactAdapter(ArrayList<Contact> listContact) {
        this.mListContact = listContact;
    }

    @Override
    public int getCount() {
        return mListContact != null?mListContact.size():0;
    }

    @Override
    public Object getItem(int position) {
        return mListContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View contactView;
        if(converView == null){
            contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_contact, parent,false);
        } else{
            contactView = converView;
        }

        Contact contact = mListContact.get(position);
        ImageView imgProduct = contactView.findViewById(R.id.imgProduct);
        TextView tvProductName = contactView.findViewById(R.id.tvProductName);
        TextView tvProductPrice = contactView.findViewById(R.id.tvProductPrice);
        TextView tvColor = contactView.findViewById(R.id.tvColor);
        TextView tvSize = contactView.findViewById(R.id.tvSize);

        ImageView imgRemove = contactView.findViewById(R.id.imgRemove);
        ImageView imgAddToCart = contactView.findViewById(R.id.imgAddToCart);


        Glide.with(parent.getContext()).load(contact.getAvatar()).into(imgProduct);
        tvProductName.setText(contact.getTvProductName());
        tvProductPrice.setText(contact.getPrice());
        tvColor.setText(contact.getColor());
        tvSize.setText(contact.getSize());



        return contactView;
    }
}
