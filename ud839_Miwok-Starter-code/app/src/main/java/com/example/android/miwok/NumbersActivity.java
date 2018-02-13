package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.x;
import static com.example.android.miwok.R.id.numbers;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one","lutti",R.drawable.number_one) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );
        numbers.add(new Word("one","lutti",R.drawable.number_six) );





        WordAdapter Adapter = new WordAdapter(this,numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
