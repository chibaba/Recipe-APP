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

        recipes1.add(new Recipes("Habanero", "14 chicken drumettes\n" +
                "1 small mango or one cheek of a big mango\n" +
                "1 teaspoon ketchup\n" +
                "2 teaspoons onion powder\n" +
                "1 teaspoon thyme\n" +
                "½ teaspoon black pepper\n" +
                "2 pinches of salt\n" +
                "1 habanero pepper\n" +
                "3 small seasoning cubes (chicken flavour)", "Method", "You can add any other fresh seasoning of your choice: onions, garlic etc but grind them very well so the pieces do not stand out.\n",R.drawable.sauce));

        recipes1.add(new Recipes("Ofe Onugbu", "Washed and squeezed bitterleaf – A handful\n" +
                "10 small corms Cocoyam\n" +
                "3 cooking spoons Red Palm Oil\n" +
                "Assorted Beef: Includes best cut, shaki (cow tripe)\n" +
                "Assorted Fish: Dry Fish and Stock Fish\n" +
                "Pepper, salt and ground crayfish (to taste)\n" +
                "3 stock cubes\n" +
                "1 teaspoon Ogiri Igbo (traditional seasoning)", "Method", "Ogiri Igbo is optional, it gives Bitterleaf Soup a traditional taste.\n", R.drawable.mixedveggiesauce));
        recipes1.add(new Recipes("Tin Tomato Stew", "1,600g tinned tomato puree\n" +
                "400g (14oz) tinned tomato paste\n" +
                "Sunflower oil or vegetable oil: a generous quantity (see the video below)\n" +
                "1.2kg hard chicken (hen)\n" +
                "1kg beef\n" +
                "2 onions\n" +
                "1 tablespoon thyme\n" +
                "2 tablespoons Nigerian curry powder\n" +
                "Habanero or Cayenne pepper (to taste)\n" +
                "Salt (to taste)", "Method", "Serve with boiled white rice, boiled yam etc.\n", R.drawable.pepper ));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter( this, recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager( this, 1));

        myrecyclerView.setAdapter(myAdapter);

    }


}