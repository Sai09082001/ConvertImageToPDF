package com.example.convertimagetopdf.base

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<BD : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity() {
    protected lateinit var binding: BD
    private lateinit var mViewModel: VM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        mViewModel = getVM()
        initViews()

    }

    abstract fun getVM(): VM

    abstract fun initViews()

    abstract fun getLayoutId(): Int

    protected fun showNotify(sms: String) {
        Toast.makeText(this, sms, Toast.LENGTH_SHORT).show()
    }

}