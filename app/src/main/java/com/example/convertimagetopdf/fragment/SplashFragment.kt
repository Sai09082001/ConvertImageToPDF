package com.example.convertimagetopdf.fragment

import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.viewModels
import com.example.convertimagetopdf.R
import com.example.convertimagetopdf.base.BaseFragment
import com.example.convertimagetopdf.databinding.SplashFragmentBinding
import com.example.convertimagetopdf.navigation.AppNavigation
import com.example.convertimagetopdf.viewmodel.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : BaseFragment<SplashFragmentBinding>() {
    @Inject
    lateinit var appNavigation: AppNavigation
    private val viewModel: SplashViewModel by viewModels()
    override fun getVM(): SplashViewModel = viewModel

    override fun initViews() {
        viewModel.stateSplash.observe(viewLifecycleOwner){
            if(it){
                Handler(Looper.getMainLooper()).postDelayed({
                    appNavigation.openSplashToLoginScreen()
                }, 2000)
            }
        }
    }

    override fun initBinding(mRootView: View): SplashFragmentBinding {
        return SplashFragmentBinding.bind(mRootView)
    }

    override fun getLayoutId(): Int = R.layout.splash_fragment
}