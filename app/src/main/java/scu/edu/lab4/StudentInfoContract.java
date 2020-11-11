package scu.edu.lab4;

import android.provider.BaseColumns;

public final class StudentInfoContract {


    public static class Students implements BaseColumns {
        public static final String TABLE_NAME = "student_info";
        public static final String STUDENT_ID = "student_id";
        public static final String STUDENT_NAME = "name";
        public static final String STUDENT_EMAIL = "email";
    }

}
