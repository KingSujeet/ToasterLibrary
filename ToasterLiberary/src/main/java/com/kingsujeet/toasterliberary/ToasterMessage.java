package com.kingsujeet.toasterliberary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {


    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }

    public static void l(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }

}
