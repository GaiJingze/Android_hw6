package com.example.homework6;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    public static final String SQL_CREATE_NOTES =
            "CREATE TABLE " + TodoNote.TABLE_NAME
                    + "(" + TodoNote._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + TodoNote.COLUMN_DATE + " INTEGER, "
                    + TodoNote.COLUMN_STATE + " INTEGER, "
                    + TodoNote.COLUMN_CONTENT + " TEXT "+")";


    public static class TodoNote implements BaseColumns {
        public static final String TABLE_NAME = "note";

        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_CONTENT = "content";

    }

}
