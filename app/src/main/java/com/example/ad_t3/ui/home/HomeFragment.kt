package com.example.ad_t3.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ad_t3.R
import com.example.ad_t3.databinding.HomeFragmentBinding
import com.example.ad_t3.dbmodel.*
import com.example.ad_t3.ui.home.viewpageradapter.HomeViewPagerItem
import com.xwray.groupie.GroupieAdapter
import com.xwray.groupie.Section

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    lateinit var binding: HomeFragmentBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = HomeFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = getHomeRecyclerList()
//        val listItem = list.map {
//            if (it is List<*>) {
//                HomeAdapterItem(it as List<Photo>)
//            }
//            else if(it is Discount) {
//                BannerItem(it)
//            }
//            else {
//                TitleItem(it as Title)
//            }
//        }


        val adapter = GroupieAdapter()
        adapter.addAll(list)
        binding.rcHome.adapter = adapter





    }

}