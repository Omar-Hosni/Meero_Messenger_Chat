package com.meero.meeromessengerchat.Adapters;

//should i extend RecyclerView.Adapter ? - if you are using recycler view then use this
//should i extend FragmentStateAdapter ? - if you are using fragments then use this

/*
if im using view pager with fragment
i should extend FragmentStateAdapter
and implement createFragment(int position)
and implement getItemCount()
and if im using TabLayout to switch between fragments
then i have to use TabLayoutMeditator(tabLayout , viewPager)
 */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.meero.meeromessengerchat.Fragments.CallsFragment;
import com.meero.meeromessengerchat.Fragments.ChatsFragment;
import com.meero.meeromessengerchat.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentStateAdapter {


    public FragmentsAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0: return new ChatsFragment();
            case 1: return new StatusFragment();
            case 2: return new CallsFragment();
            default: return new ChatsFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

}

