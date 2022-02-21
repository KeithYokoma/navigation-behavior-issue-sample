package dev.keithyokoma.navigationbehaviorissuepoc.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import dev.keithyokoma.navigationbehaviorissuepoc.R
import dev.keithyokoma.navigationbehaviorissuepoc.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.openScreenAButton.setOnClickListener {
            findNavController().navigate(R.id.nav_home_to_screen_a)
        }
        binding.openScreenBButton.setOnClickListener {
            findNavController().navigate(R.id.nav_home_to_screen_b)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}