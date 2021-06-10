package com.danta.sidqi.pasproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class RvActivity extends AppCompatActivity {

    private RecyclerView rv;
    private RvAdapter adapter;
    private ArrayList<Model> list;
    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        rv = (RecyclerView) findViewById(R.id.rvlist);
        bundle = getIntent().getExtras();
        int chs = bundle.getInt("num");

        if (chs == 1){
            addmeatData();
        } else if (chs == 2){
            addvegData();
        } else if (chs == 3){
            addpastaData();
        }else if (chs == 4){
            addsfData();
        }
        adapter = new RvAdapter(list, new RvAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Intent pass = new Intent(getApplicationContext(), RecipeActivity.class);
                Model myModel = list.get(position);
                pass.putExtra("ttl", myModel.getRcpname());
                pass.putExtra("dif", myModel.getDiff());
                pass.putExtra("ingrid", myModel.getIngri());
                pass.putExtra("step", myModel.getSteps());
                pass.putExtra("img", myModel.getImg());
                startActivity(pass);
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RvActivity.this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(layoutManager);
    }

    void addmeatData() {
        list = new ArrayList<>();
        list.add(new Model("Easy butter chicken", "Beginner", "1/2 cup Greek-style yoghurt\n" +
                "\n2 garlic cloves, crushed" +
                "\n3cm piece ginger, peeled, finely grated" +
                "\n2 tsp ground cumin" +
                "\n2 tsp ground coriander" +
                "\n1 tsp garam masala" +
                "\n1/4 tsp chilli powder" +
                "\n600g Lilydale Free Range Chicken Thigh, cut into 3cm pieces" +
                "\n1 tbsp vegetable oil" +
                "\n20g butter" +
                "\n1 brown onion, halved, thickly sliced" +
                "\n410g can tomato puree" +
                "\n1/2 cup Massel chicken style liquid stock" +
                "\n1/2 cup thickened cream" +
                "\nBasmati rice, to serve" +
                "\nCoriander leaves, to serve", "Step 1" +
                "\n" +
                "\nPlace yoghurt, garlic, ginger, cumin, coriander, garam masala and chilli powder in a glass or ceramic dish. Add chicken. Stir to coat. Cover. Refrigerate for 2 hours." +
                "\nStep 2" +
                "\n" +
                "\nHeat oil and butter in a heavy-based saucepan over medium-high heat. Add onion. Cook, stirring occasionally, for 3 to 4 minutes or until softened. Add chicken mixture to pan. Cook, stirring, for 5 minutes or until chicken just starts to change colour. Add tomato puree and stock. Cover. Bring to the boil. Reduce heat to low. Simmer, stirring occasionally, for 10 minutes or until chicken is tender and mixture has thickened slightly." +
                "\nStep 3" +
                "\n" +
                "\nStir in cream. Simmer for a further 5 minutes or until heated through. Serve with steamed rice and coriander leaves.",
                "This classic Indian dish is a favourite in Aussie households. Re-create it at home in a flash.", R.drawable.butterchick));
        list.add(new Model("Basic beef burger", "Beginner", "gg", "gf",
                "Why order take-away when you can enjoy these loaded hamburgers at home?", R.drawable.burger));
        list.add(new Model("Curried sausage", "Intermediate", " asda", "",
                "Take a trip down memory lane with this classic curried sausage recipe.", R.drawable.currysausage));
        list.add(new Model("Beef nachos", "Intermediate", "zxca", "ffzx",
                "Dive into a piping hot bowl of beef nachos topped with melted cheese - yum!", R.drawable.nachos));
        list.add(new Model("Pad Thai", "Expert", "kjklf", "asfad",
                "This pad Thai with the delicious combination of chicken and prawns is a taste member favourite.", R.drawable.padthai));

        list.add(new Model("Curtis Stone's stir fried noodles w chicken", "Expert", "asf", "adz",
                "Throw together a quick and easy weeknight dinner with Curtis Stone's 30 minute chicken, vegetable and noodle stir-fry.", R.drawable.chickfriedrice));


    }

    void addvegData() {
        list = new ArrayList<>();
        list.add(new Model("Zucchini fritters", "Intermediate", "loadlo", "asdasd",
                "Here's a clever way to get the kids to eat their vegies. These Zucchini fritters are also great served as a side dish", R.drawable.zuchini));
        list.add(new Model("Hearty chicken and vegg soup", "Intermediate", "asd", "xxvc",
                "Warm up with this hearty chicken and vegetable soup.", R.drawable.vegsoup));
        list.add(new Model("Potato gnocchi", "Beginner", "dzx", "qoz",
                "Create a delicious Italian meal from scratch with this step-by-step guide to perfect potato gnocchi.", R.drawable.gnochi));
        list.add(new Model("Vietnamese rice paper rolls", "Expert", "apos", "ololc",
                "Roll up these rice paper rolls for a fresh healthy start to your Vietnamese feast.", R.drawable.paperrol));
        list.add(new Model("Creamy chickpea and vegg curry", "Expert", "kzl", "xc",
                "Boasting 7 serves of vegetables, this vegetarian curry is slow cooked perfection. Enjoy for dinner tonight!", R.drawable.vegcurry));


    }

    void addpastaData() {
        list = new ArrayList<>();
        list.add(new Model("Creamy fettucine", "Intermediate", "loadlo", "asdasd",
                "This clever carbonara sauce is ready in a flash.", R.drawable.fettu));
        list.add(new Model("Spaghetti carbonara", "Intermediate", "loadlo", "asdasd",
                "Quick, easy and delicious - try this carbonara and see if you think it's the best!", R.drawable.carbonara));
        list.add(new Model("Lasagna", "Intermediate", "loadlo", "asdasd",
                "Why is this our favourite beef lasagne recipe? Make it tonight and find out!", R.drawable.lasagna));
        list.add(new Model("Creamy chicken pesto pasta", "Intermediate", "loadlo", "asdasd",
                "Use up leftover roast chicken, or buy a barbecued chicken from the supermarket, and turn it into this super easy pasta dish.", R.drawable.pesto));
        list.add(new Model("Italian beef meatballs", "Expert", "loadlo", "asdasd",
                "Bring the family together with old-fashioned Italian beef meatballs. They go perfectly with spaghetti", R.drawable.meatbals));
    }

    void addsfData() {
        list = new ArrayList<>();
        list.add(new Model("Crispy-skinned salmon", "Beginner", "loadlo", "asdasd",
                "We have the chef's secrets on crispy-skinned salmon. With our clever tips you won't have to go out for dinner!", R.drawable.salmon));
        list.add(new Model("Tuna mornay", "Intermediate", "loadlo", "asdasd",
                "Fish is fast and full of omega-3, perfect for growing brains.", R.drawable.tuna));
        list.add(new Model("Fish Taco", "Beginner", "adzc", "gsdf",
                "Fish makes a healthy taco filling, and it tastes absolutely delicious.", R.drawable.ftaco));
        list.add(new Model("Fish & Chips", "Intermediate", "asd", "das",
                "Save money by making your own tasty fish and chips.", R.drawable.fnc));
        list.add(new Model("Creamy garlic prawns", "Expert", "asd", "das",
                "This deliciously creamy prawn recipe from taste member, 'KRISSY86' is perfect for a quick weeknight meal.", R.drawable.garlicprawns));

    }
}
