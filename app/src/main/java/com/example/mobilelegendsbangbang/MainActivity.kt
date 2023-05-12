package com.example.mobilelegendsbangbang

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest

class MainActivity : AppCompatActivity() {



    private static final String TAGNAME = MainActivity.class.getSimpleName();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun ClickHandlere(view: View) {
        Toast.makeText(this,"Button clické",Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAGNAME,"on est dans ");
        JsonObjectRequest request = new JsonArrayRequest(
            DownloadManager.Request.Method.GET,HTTP_URL,null,
        new Response.Listner<JSONObject>{
            //Log.e(MainActivity.class.getSimpleName().getMessage());
        }
    }
}