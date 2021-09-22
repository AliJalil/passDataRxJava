package com.example.passdatarxjava

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.passdatarxjava.databinding.ActivityMainBinding
import com.example.passdatarxjava.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {
    override val LOG_TAG: String = "FirstFragment"
    override val bindingInflater: (LayoutInflater) -> FragmentFirstBinding =
        FragmentFirstBinding::inflate


    override fun setup() {

        var txt = binding?.editTxt?.text.toString()
        RxBus.getSubject().onNext(txt)
    }

    override fun addCallBack() {

    }
}
