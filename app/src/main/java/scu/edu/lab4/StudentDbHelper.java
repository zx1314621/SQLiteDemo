package scu.edu.lab4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class StudentDbHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "students.db";
    private static final int DATABASE_VERSION = 1;
    public StudentDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }




    private static final String CREATE_TABLE = "CREATE TABLE " +
            StudentInfoContract.Students.TABLE_NAME + "(" +
            StudentInfoContract.Students._ID  + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            StudentInfoContract.Students.STUDENT_NAME + " TEXT NOT NULL, " +
            StudentInfoContract.Students.STUDENT_ID + " TEXT NOT NULL, " +
            StudentInfoContract.Students.STUDENT_EMAIL + " TEXT" +
            ")";

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CREATE_TABLE);
    }


    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + StudentInfoContract.Students.TABLE_NAME;
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);

    }
}
