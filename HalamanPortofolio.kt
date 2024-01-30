package com.example.belajarnavigasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.belajarnavigasi.databinding.FragmentHalamanPortofolioBinding

// TODO: Rename parameter arguments, choose names that match
/**
 * A simple [Fragment] subclass.
 * Use the [HalamanPortofolio.newInstance] factory method to
 * create an instance of this fragment.
 */
class HalamanPortofolio : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentHalamanPortofolioBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_portofolio, container, false)

        binding.button8.setOnClickListener{
            it.findNavController().navigate(R.id.action_halamanPortofolio_to_dashboard)
        }
        return binding.root
    }

}