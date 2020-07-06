package com.imamfarisi.myalquran;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class QuranDAO extends DBHelper {

    public QuranDAO(Context context) {
        super(context);
    }

    public List<Item> getListDataWhereCriteria(String table, Integer value) {
        List<Item> recordsList = new ArrayList<>();
        String sql = "SELECT * FROM " + TABLE_NAME + " where " + table + " = '" + value + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            do {
                Integer suratId = cursor.getInt(cursor.getColumnIndex("SuratID"));
                Integer verseId = cursor.getInt(cursor.getColumnIndex("VerseID"));
                String ayatText = cursor.getString(cursor.getColumnIndex("AyatText"));

                Item dataObj = new Item();
                dataObj.setSuratId(suratId);
                dataObj.setVerseId(verseId);
                dataObj.setAyatText(ayatText);
                recordsList.add(dataObj);

            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return recordsList;
    }
}
