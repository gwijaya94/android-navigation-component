package id.gwijaya94.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import id.gwijaya94.navigationcomponent.ui.home.HomeFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
//    private var tabList = listOf(HomeFragment(), ProfileFragment())

    //    override fun getItemCount(): Int = tabList.size
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment = HomeFragment.newInstance(position + 1)

}