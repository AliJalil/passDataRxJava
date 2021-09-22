package com.example.passdatarxjava

import android.view.LayoutInflater
import com.example.passdatarxjava.databinding.FragmentSecondBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    override val LOG_TAG: String = "SecondFragment"
    override val bindingInflater: (LayoutInflater) -> FragmentSecondBinding =
        FragmentSecondBinding::inflate

    private val compositeDisposable = CompositeDisposable()

    override fun setup() {
        RxBus.getSubject().observeOn(AndroidSchedulers.mainThread()).subscribe(::updateText).addTo(compositeDisposable)
    }

    private fun updateText(newValue: Any){
        binding?.txtView?.text = newValue.toString()
    }
    override fun addCallBack() {

    }
}

fun Disposable.addTo(compositeDisposable: CompositeDisposable){
    compositeDisposable.add(this)
}