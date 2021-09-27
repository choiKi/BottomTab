package com.ckh.bottomtab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ckh.bottomtab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        mBinding = ActivityMainBinding.inflate(layoutInflater)


        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            //container = FrameLayout id
            when(it.itemId){
                R.id.menu1 -> {
                    with(supportFragmentManager.beginTransaction()){
                        val first = FirstFragment()
                        replace(R.id.container,first)
                    }.commit()
                }
                R.id.menu2 -> {
                    with(supportFragmentManager.beginTransaction()){
                        val second = SecondFragment()
                        replace(R.id.container,second)
                    }.commit()
                }
                R.id.menu1 -> {
                    with(supportFragmentManager.beginTransaction()){
                        val third = ThirdFragment()
                        replace(R.id.container,third)
                    }.commit()
                }
                R.id.menu4 -> {
                    with(supportFragmentManager.beginTransaction()){
                        val fouth = FouthFragment()
                        replace(R.id.container,fouth)
                    }.commit()
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}