package com.mobile.lab1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.lab1.databinding.FragmentProfileBinding

data class User(val name: String, val email: String)

class ProfileFragment : LoggingFragment("ProfileFragment") {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = User(
            name = "Андрей",
            email = "andrew@gmail.com"
        )

        binding.tvName.text = user.name
        binding.tvEmail.text = "Email: ${user.email}"
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}