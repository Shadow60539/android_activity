package com.example.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity(private val layOutResId: Int, private val tag: String) :
    AppCompatActivity() {

    abstract val context: Context
    private lateinit var activityResult: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layOutResId)
        activityResult =
            registerForActivityResult(
                ActivityResultContracts.StartActivityForResult(),
                activityResultCallback(),
            )

    }

    private fun activityResultCallback() = { result: ActivityResult ->
        when (result.resultCode) {
            RESULT_OK -> Toast.makeText(this, result.data?.data?.path, Toast.LENGTH_SHORT)
                .show()
        }
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
//        val intent = Intent(context, SecondActivity::class.java)
//        startActivity(intent)
        val intent = Intent().apply {
            action = Intent.ACTION_GET_CONTENT
            type = "image/*"
//            addCategory(Intent.CATEGORY_DEFAULT)
        }

        activityResult.launch(intent)
    }

    open fun navigateToThirdActivity(view: View) {
        val intent = Intent(context, ThirdActivity::class.java)
        startActivity(intent)
    }
}