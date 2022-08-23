package com.msdio.foodmarket.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.msdio.foodmarket.R
import com.msdio.foodmarket.databinding.FragmentSignupAddressBinding
import com.msdio.foodmarket.databinding.FragmentSignupBinding
import com.msdio.foodmarket.ui.auth.AuthActivity

class SignupAddressFragment : Fragment() {

    private var _binding: FragmentSignupAddressBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignupAddressBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignUpComplete.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signup_success, null)

            (activity as AuthActivity).toolbarSignUpSuccess()
        }
    }
}