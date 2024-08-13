package com.androidexp.android55_btvn_day5;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private ArrayList<String> mListProduct;
    private ArrayList<Contact> mListData;
    private ArrayList<String> mListImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initView() {
        lvContact = findViewById(R.id.lvContact);


        ContactAdapter contactAdapter = new ContactAdapter(mListData);
        lvContact.setAdapter(contactAdapter);
    }

    private void initData() {

        mListImg = new ArrayList<>();
        mListImg.add("https://vcdn1-dulich.vnecdn.net/2021/07/16/1-1626437591.jpg?w=460&h=0&q=100&dpr=2&fit=crop&s=i2M2IgCcw574LT-bXFY92g");
        mListImg.add("https://360iagency.com.vn/wp-content/uploads/2023/08/background-chup-anh-san-pham-360i-Agency.jpeg");
        mListImg.add("https://margram.vn/files/chup-anh-san-pham-8.jpg");
        mListImg.add("https://www.chuphinhsanpham.vn/wp-content/uploads/2022/03/EDEN-EVA-APPLE-NUOC-TAO-LEN-MEN-chup-anh-san-pham-dep-0002.jpg");

        mListProduct = new ArrayList<>();
        for(int i=0; i < 10; i++){
            mListProduct.add("Product: "+i);
        }

        mListData = new ArrayList<>();
        for (int i=0; i < 10; i++){
            Contact contact = new Contact();
            contact.setTvProductName("Product: " +i);
            contact.setPrice((new Random().nextInt())+"$");
            contact.setColor("Pink");
            contact.setSize("M");
            contact.setAvatar(mListImg.get(i % mListImg.size()));
            mListData.add(contact);
        }
    }

}