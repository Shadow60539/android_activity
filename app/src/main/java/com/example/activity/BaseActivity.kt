package com.example.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity(private val layOutResId: Int, private val tag: String) :
    AppCompatActivity() {

    abstract val context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layOutResId)
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "$tag: OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "$tag: OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "$tag: OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "$tag: OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "$tag: OnDestroy")
    }

    open fun navigateToMainActivity(view: View) {
        val intent = Intent(context, MainActivity::class.java)
        startActivity(intent)
    }

    open fun navigateToSecondActivity(view: View) {
        val intent = Intent(context, SecondActivity::class.java)
        startActivity(intent)
    }

    open fun navigateToThirdActivity(view: View) {
        val intent = Intent(context, ThirdActivity::class.java)
        startActivity(intent)
    }
}