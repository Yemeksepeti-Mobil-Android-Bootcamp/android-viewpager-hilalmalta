package com.hm.vewpagerhomework

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


private const val PAGE_NUMBER = 3

class ViewPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = PAGE_NUMBER

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstPageFragment()
            1 -> SecondPageFragment()
            else -> ThirdPageFragment()
        }
    }

}