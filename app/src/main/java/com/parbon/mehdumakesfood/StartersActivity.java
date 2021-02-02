package com.parbon.mehdumakesfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);


        Dish[] dishes = {
                new Dish("Bean and tofu soup","A soup with beans and tofu made with cream and onions",999),
                new Dish("Chicken and mango mousse","A creamy mousse made with free range chicken and fresh mango",1199),
                new Dish("Nori and mushroom soup","Nori and shitake mushroom combined into chunky soup",599 ),
                new Dish("Chicken and celeriac parcels","Thin filo pastry cases stuffed with free range chicken and fresh celeriac",499),
                new Dish("Chilli and mayonnaise dip","Chilli and mayonnaise dip",299),
                new Dish("Karengo and crab soup","Karengo and crab combined into smooth soup",599),
                new Dish("Vermicelli and bean soup","Vermicelli and bean combined into smooth soup",599),
                new Dish("Borscht and cheese soup","Borscht and fresh cheese combined into creamy soup",599),
                new Dish("Tofu and fish dumplings","Thin pastry cases stuffed with crispy tofu and fish",499),
                new Dish("Chickpea and horseradish gyoza","Thin pastry cases stuffed with fresh chickpea and horseradish",499),
                new Dish("Celeriac and cheese wontons","Thin wonton cases stuffed with fresh celeriac and cheese",499),
                new Dish("Spaghetti salad with garlic dressing","A mouth-watering spaghetti salad served with garlic dressing",699),
                new Dish("Jalapeno and cardamom gyoza","Thin pastry cases stuffed with fresh jalapeno and black cardamom",499),
                new Dish("Jalapeno and cardamom wontons","Thin wonton cases stuffed with fresh jalapeno and green cardamom",499),
                new Dish("Celeriac and aubergine gyoza","Thin pastry cases stuffed with fresh celeriac and salted aubergine",599)
        };

        /*String[] dishes = {
                "Bean and tofu soup",
                "Sausage and nectarine gyoza",
                "Parsley and pesto wontons",
                "Cannellini and parsnip soup",
                "Jalapeno and nectarine parcels",
                "Cabbage and mushroom parcels",
                "Fish and rosemary parcels",
                "Squash and ginger soup",
                "Pepper and salmon uramaki",
                "Peppercorn and feta gyoza",
                "Cabbage and feta wontons",
                "Egg and lemon soup",
                "Cabbage and tofu dumplings",
                "Chicken and coriander parcels",
                "Aubergine and avocado uramaki",
                "Mushroom and trout wontons",
                "Aubergine and cabbage gyoza",
                "Ricotta and veal wontons",
                "Rosemary and chilli wontons",
                "Karengo and sprout soup"

        };*/

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}