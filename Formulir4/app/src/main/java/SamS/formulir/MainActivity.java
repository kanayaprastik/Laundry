package SamS.formulir;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNama, etAlamat, etEmail, etHP;
    private Spinner spJenisKelamin, spAgama;
    Button simpan;
    DBFormulir dbFormulir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spAgama = findViewById(R.id.spMAIN_agama);
        spJenisKelamin = findViewById(R.id.spMAIN_jeniskelamin);
        dbFormulir = new DBFormulir(this);
        etNama = findViewById(R.id.etMAIN_name);
        etAlamat = findViewById(R.id.etMAIN_alm);
        etEmail = findViewById(R.id.etMAIN_email);
        etHP = findViewById(R.id.etMAIN_hp);

        simpan = findViewById(R.id.btSimpan);
        simpan.setOnClickListener(v ->{
            SQLiteDatabase sqLiteDatabase = dbFormulir.getWritableDatabase();
            String simpan = "insert into formulir " +
                    "(nama, alamat, email, no_hp, jenis_kelamin, agama)" +
                    "values ('"+etNama.getText()+"'," +
                    "'"+etAlamat.getText()+"'," +
                    "'"+etEmail.getText()+"'," +
                    "'"+etHP.getText()+"'," +
                    "'"+spJenisKelamin.getSelectedItemPosition()+"'," +
                    "'"+spAgama.getSelectedItemPosition()+"')";
            sqLiteDatabase.execSQL(simpan);
            Toast.makeText(this, "Data Pendaftaran Berhasil Disimpan",
                    Toast.LENGTH_SHORT).show();
            DataFormulir.df.RefreshList();
            finish();
        });
    }
}