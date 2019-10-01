package zzvanhai81.gmail.com.listview_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listCountry;
    ArrayList<country> arrayCountry;
    countryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter = new countryAdapter(this, R.layout.linecountry, arrayCountry);
        listCountry.setAdapter(adapter);
    }
    private void Anhxa(){
        listCountry = (ListView) findViewById(R.id.listCountry);
        arrayCountry = new ArrayList<>();

        arrayCountry.add(new country("Pikachu", "Hệ: hệ Điện", R.drawable.pikachu));
        arrayCountry.add(new country("Fushigidane", "Hệ: hệ Cỏ", R.drawable.fushigidane));
        arrayCountry.add(new country("Hitokage", "Hệ: hệ Lửa", R.drawable.hitokage));
        arrayCountry.add(new country("zenigame", "Hệ: hệ Nước", R.drawable.zenigame));
        arrayCountry.add(new country("Rokon", "Hệ: hệ Băng", R.drawable.rokon));
        arrayCountry.add(new country("Pigeot", "Hệ: hệ Bay", R.drawable.pigeot));
        arrayCountry.add(new country("Windie", "Hệ: hệ Lửa", R.drawable.windie));
        arrayCountry.add(new country("Karakara", "Hệ: hệ Đất", R.drawable.karakara));
        arrayCountry.add(new country("Gyarados", "Hệ: Nước", R.drawable.gyarados));
        arrayCountry.add(new country("Rayquaza", "Hệ: Rồng", R.drawable.rayquaza));

    }
}
