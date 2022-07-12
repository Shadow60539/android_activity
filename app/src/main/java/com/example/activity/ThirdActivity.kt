package com.example.activity

import android.content.Context
import android.view.View

class ThirdActivity : BaseActivity(R.layout.activity_third, "ThirdActivity") {
    override val context: Context
        get() = this

    override fun navigateToMainActivity(view: View) {
        super.navigateToMainActivity(view)
    }

    override fun navigateToSecondActivity(view: View) {
        super.navigateToSecondActivity(view)
    }

}