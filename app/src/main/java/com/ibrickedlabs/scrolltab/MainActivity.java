package com.ibrickedlabs.scrolltab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ibrickedlabs.FragmentA;
import com.ibrickedlabs.FragmentB;
import com.ibrickedlabs.FragmentC;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById( R.id.viewpager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        /**
         * viewpager asks adapter for number of fragments that is it will invoke geCount method.
         * And then it will ask for Item at that particular view
         * And the getPagerTitle gives the title of the tabs even
         */
        MyAdapter myAdapter=new MyAdapter(fragmentManager);

        viewPager.setAdapter(myAdapter);


    }
    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
           viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }


    class  MyAdapter extends FragmentStatePagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment obj=null;
            if(position==0){
                 obj=(Fragment)new FragmentA();

            }
            if(position==1){
                obj=(Fragment)new FragmentB();

            }
            if(position==2){
                 obj=(Fragment)new FragmentC();

            }
            return obj;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String s=null;
            if(position==0){
                s="TAB-A";
            }
            if(position==1){
                s="TAB-B";
            }
            if(position==2){
                s="TAB-C";
            }
            return s;
        }
    }
}
