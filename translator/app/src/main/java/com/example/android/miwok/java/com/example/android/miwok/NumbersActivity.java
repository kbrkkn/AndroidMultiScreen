package com.example.android.miwok.java.com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("bir","one",R.drawable.number_one));
        words.add(new Word("iki","two",R.drawable.number_two));
        words.add(new Word("üç","three",R.drawable.number_three));
        words.add(new Word("dört","four",R.drawable.number_four));
        words.add(new Word("beş","five",R.drawable.number_five));
        words.add(new Word("altı","six",R.drawable.number_six));
        words.add(new Word("yedi","seven",R.drawable.number_seven));
        words.add(new Word("sekiz","eight",R.drawable.number_eight));
        words.add(new Word("dokuz","nine",R.drawable.number_nine));
        words.add(new Word("on","ten",R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
