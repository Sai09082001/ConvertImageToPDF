package com.example.convertimagetopdf.fragment

import android.view.View
import androidx.fragment.app.viewModels
import com.example.convertimagetopdf.R
import com.example.convertimagetopdf.base.BaseFragment
import com.example.convertimagetopdf.databinding.LoginFragmentBinding
import com.example.convertimagetopdf.navigation.AppNavigation
import com.example.convertimagetopdf.share.UserPreference
import com.example.convertimagetopdf.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class LoginFragment : BaseFragment<LoginFragmentBinding>() {
    @Inject
    lateinit var appNavigation: AppNavigation
    @Inject
    lateinit var sharedPreferences: UserPreference

    private val viewModel: LoginViewModel by viewModels()
    override fun getVM(): LoginViewModel = viewModel

    override fun initViews() {


    }

    override fun initBinding(mRootView: View): LoginFragmentBinding = LoginFragmentBinding.bind(mRootView)

    override fun getLayoutId(): Int = R.layout.login_fragment
}