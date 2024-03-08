package com.example.hw8.ui.main

import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.navigation.fragment.findNavController
import com.example.hw8.R
import com.example.hw8.databinding.GreetingFragmentBinding


class GreetingFragment : Fragment() {

    private lateinit var binding: GreetingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = GreetingFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.animate().apply {
            duration = 1000
            rotation(360f)
        }
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_greetingFragment_to_surveyFragment)
        }
    }

}