package SamS.formulir;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import  android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBFormulir extends SQLiteOpenHelper{
    public DBFormulir(@Nullable Context context){
        super(context, "formulir.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String table = "Create table formulir(" +
                "id_pendaftaran integer primary key autoincrement," +
                "nama text, " +
                "alamat text," +
                "email text," +
                "no_hp text," +
                "jenis_kelamin integer," +
                "agama integer)";
        sqLiteDatabase.execSQL(table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
