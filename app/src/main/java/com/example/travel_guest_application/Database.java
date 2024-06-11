package com.example.travel_guest_application;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "bookings_db";
    private static final int DATABASE_VERSION = 1;
    // Table and column names
    private static final String BOOKING_TABLE = "booking";//table
    private static final String ID_COLUMN = "id";
    private static final String NAME_COLUMN = "name";


    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query1 = "create table Bookings(Firstname text,Lasstname text, Email text, Contact int)";// Create the Owners table
        //String query2 = "create table Owners(Username text, Email text, Password text)";
        sqLiteDatabase.execSQL(query1);
        //sqLiteDatabase.execSQL(query2);
    }
        public void book(String Firstname,String Lasstname,String Email,int Contact){
            ContentValues cv = new ContentValues();
            cv.put("Firstname", Firstname);
            cv.put("Lasstname", Lasstname);
            cv.put("Email", Email);
            cv.put("Contact", Contact);
            SQLiteDatabase db = getWritableDatabase();
            db.insert("Bookings", null,cv);
            db.close();
        }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
