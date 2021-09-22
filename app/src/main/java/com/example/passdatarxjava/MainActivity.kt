package com.example.passdatarxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.passdatarxjava.databinding.ActivityMainBinding
import io.reactivex.rxjava3.disposables.CompositeDisposable

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val compositeDisposable = CompositeDisposable()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addFragment1(FirstFragment())
        addFragment2(SecondFragment())

    }


    private fun addFragment1(fragment: Fragment) {
        binding?.let {
                    this.supportFragmentManager.beginTransaction().add(it.fragment1Container.id, fragment).commit()
        }
    }

    private fun addFragment2(fragment: Fragment) {
        binding?.let {
            this.supportFragmentManager.beginTransaction().add(it.fragment2Container.id, fragment).commit()
        }
    }
}