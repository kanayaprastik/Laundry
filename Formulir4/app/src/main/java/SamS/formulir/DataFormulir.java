package SamS.formulir;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Currency;

public class DataFormulir extends AppCompatActivity {

    ListView lvData;
    TextView tvKet;
    FloatingActionButton fabTambah;
    String[] nama;
    int[] idpendaftaran;
    protected Cursor cursor;
    DBFormulir dbFormulir;
    public static DataFormulir df;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_formulir);
        lvData = findViewById(R.id.lvData);
        tvKet = findViewById(R.id.tvKeterangan);
        fabTambah = findViewById(R.id.fabTambahData);
        df = this;
        dbFormulir = new DBFormulir(this);
        RefreshList();
    }

    public void RefreshList(){
        SQLiteDatabase db = dbFormulir.getReadableDatabase();
        cursor = db.rawQuery("select * from fromulir", null);
        idpendaftaran = new int[cursor.getCount()];
        nama = new String[cursor.getCount()];
        cursor.moveToFirst();
        if(cursor.getCount()>0){
            tvKet.setVisibility(View.INVISIBLE);
        }
        for(int i=0;i<cursor.getCount();i++){
            cursor.moveToPosition(i);
            idpendaftaran[i]=cursor.getInt(0);
            nama[i]= cursor.getString(1);
        }
        lvData.setAdapter(new ArrayAdapter(this, android.R.layout.activity_list_item, nama));
        lvData.setSelected(true);
    }
}
