package com.example.convertimagetopdf.act

import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.convertimagetopdf.R
import com.example.convertimagetopdf.base.BaseActivity
import com.example.convertimagetopdf.databinding.ActivityMainBinding
import com.example.convertimagetopdf.navigation.AppNavigation
import com.example.convertimagetopdf.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    @Inject
    lateinit var appNavigation: AppNavigation

    private val viewModel : MainViewModel by viewModels()
    override fun getVM(): MainViewModel = viewModel

    override fun initViews() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        appNavigation.bind(navHostFragment.navController)
    }

    override fun getLayoutId(): Int = R.layout.activity_main
}