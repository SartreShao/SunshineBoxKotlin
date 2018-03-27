package com.tipchou.sunshineboxkotlin.page.index

import android.os.Bundle
import com.tipchou.sunshineboxkotlin.R
import com.tipchou.sunshineboxkotlin.page.base.BaseActivity

class IndexActivity : BaseActivity() {
    override fun created(bundle: Bundle?) {
        val fragmentTransaction: android.support.v4.app.FragmentTransaction? = supportFragmentManager.beginTransaction()
        val fragment = IndexFragment()
        fragmentTransaction?.replace(R.id.index_act_framelayout, fragment)
        fragmentTransaction?.commit()
    }

    override fun resume() {

    }

    override fun layoutId(): Int = R.layout.activity_index
}
