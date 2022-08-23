package com.msdio.foodmarket.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.msdio.foodmarket.R
import com.msdio.foodmarket.databinding.ActivityAuthBinding
import com.msdio.foodmarket.databinding.FragmentSignupAddressBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAuthBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val pageRequest = intent.getIntExtra("page_request", 0)

        if(pageRequest == 2) {
            toolbarSignUp()
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_signup, null, navOptions)
        }
    }

    fun toolbarSignUp() {
        binding.authToolbar.toolbar.title = "Sign Up"
        binding.authToolbar.toolbar.subtitle = "Register and Eat"
        binding.authToolbar.toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000, null)
        binding.authToolbar.toolbar.setNavigationOnClickListener{onBackPressed()}
    }

    fun toolbarSignUpAddress() {
        binding.authToolbar.toolbar.title = "Address"
        binding.authToolbar.toolbar.subtitle = "Make sure it`s valid"
        binding.authToolbar.toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000, null)
        binding.authToolbar.toolbar.setNavigationOnClickListener{onBackPressed()}
    }

    fun toolbarSignUpSuccess() {
        binding.authToolbar.toolbar.visibility = View.GONE
    }
}