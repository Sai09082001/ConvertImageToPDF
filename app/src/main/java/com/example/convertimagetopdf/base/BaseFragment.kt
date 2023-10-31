package com.example.convertimagetopdf.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel


abstract class BaseFragment<K : ViewDataBinding> : Fragment() {
    lateinit var mRootView: View
    var mData: Any? = null

    private var _binding: K? = null

    protected abstract fun getVM(): ViewModel

    companion object {
        const val SYS_ERROR: String = "Có lỗi xảy ra!"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = inflater.inflate(getLayoutId(), container, false)
        _binding = initBinding(mRootView)
        return requireNotNull(_binding).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun showNotify(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    fun showNotify(text: Int) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    abstract fun initViews()

    abstract fun initBinding(mRootView: View): K

    protected abstract fun getLayoutId(): Int
}