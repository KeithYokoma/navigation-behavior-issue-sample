package dev.keithyokoma.navigationbehaviorissuepoc.ui.content

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dev.keithyokoma.navigationbehaviorissuepoc.R
import dev.keithyokoma.navigationbehaviorissuepoc.databinding.FragmentScreenABinding

class ScreenAFragment : Fragment() {
    private var _binding: FragmentScreenABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentScreenABinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.openScreenAButton.setOnClickListener {
            findNavController().navigate(R.id.nav_screen_a_to_screen_a)
        }
        binding.openScreenBButton.setOnClickListener {
            findNavController().navigate(R.id.nav_screen_a_to_screen_b)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}