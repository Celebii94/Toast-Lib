package com.demo.mylibrary;

import android.content.Context;
import android.widget.Toast;

    public class ToastMessage {

        public void s(Context c, String message){

            Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

        }

}
