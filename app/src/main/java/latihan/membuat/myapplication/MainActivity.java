package latihan.membuat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import latihan.membuat.myapplication.Adapter.ProdukAdapter;
import latihan.membuat.myapplication.Model.Produk;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Produk> produkArrayList;
    private static ProdukAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        produkArrayList = new ArrayList<>();

        Produk produk1 = new Produk("Kacang Garuda 375g", 37000, R.drawable.garuda);
        Produk produk2 = new Produk("Hit Anti Nyamuk Elektrik", 16900, R.drawable.hit);
        Produk produk3 = new Produk("Aqua Air Mineral 600ml", 4400, R.drawable.aqua);
        Produk produk4 = new Produk("Pocari Sweat 500ml", 9000, R.drawable.pocari);

        Produk produk5 = new Produk("Indomie Ayam Bawang 69g", 3100, R.drawable.indomie);
        Produk produk6 = new Produk("Ultra Milk 250ml", 8100, R.drawable.ultra);
        Produk produk7 = new Produk("Sania Minyak Goreng 2L", 34200, R.drawable.sania);
        Produk produk8 = new Produk("Tropical Minyak Goreng", 35200, R.drawable.tropical);

        produkArrayList.add(produk1);
        produkArrayList.add(produk2);
        produkArrayList.add(produk3);
        produkArrayList.add(produk4);
        produkArrayList.add(produk5);
        produkArrayList.add(produk6);
        produkArrayList.add(produk7);
        produkArrayList.add(produk8);

        adapter = new ProdukAdapter(produkArrayList, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        "Nama Produk yang dipilih : "+ adapter.getItem(position).getNamaProduk(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}