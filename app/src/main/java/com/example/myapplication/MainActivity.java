package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;

    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();

        recipes1.add(new Recipes( "chicken stew", "1 Whole Chicken (hen)\n" +
                "2 cooking spoons vegetable oil\n" +
                "5 Spring onions\n" +
                "8 fresh plum tomatoes (Jos tomatoes)\n" +
                "8 medium Carrots\n" +
                "1 small cabbage\n" +
                "3 medium Irish potatoes\n" +
                "1 red bell pepper (optional)\n" +
                "1 green bell pepper\n" +
                "Salt (to taste)\n" +
                "3 big stock cubes\n" +
                "1 tablespoon thyme", "Method", "This tasty sauce, made from chopped salad vegetables is a colourful way to enjoy a wide range of staple foods with vegetables.\n", R.drawable.ayamase));

        recipes1.add(new Recipes("Mama put", "4 big tatashe peppers\n" +
                "4 Habanero Peppers (or to your taste)\n" +
                "4 fresh tomatoes\n" +
                "5 cooking spoons sunflower oil (vegetable oil)\n" +
                "1 red onion\n" +
                "250g shaki (cow tripe)\n" +
                "250g ponmo (cow skin)\n" +
                "Fish (I used Gilt Head Sea bream fish in the video below)\n" +
                "2 small seasoning cubes\n" +
                "1 teaspoon thyme\n" +
                "1 tablespoon Nigerian curry powder\n" +
                "Salt (to taste)", "Method", "If you do not have shaki and ponmo, use any part of beef available to you.\n",R.drawable.beefstew));

        recipes1


        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter( this, recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager( this, 1));

        myrecyclerView.setAdapter(myAdapter);

    }


}