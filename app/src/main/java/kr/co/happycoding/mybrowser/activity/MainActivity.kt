package kr.co.happycoding.mybrowser.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.print.PrintJob
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.textview.MaterialTextView
import kr.co.happycoding.mybrowser.R
import kr.co.happycoding.mybrowser.databinding.ActivityMainBinding
import kr.co.happycoding.mybrowser.model.Bookmark
import kr.co.happycoding.mybrowser.model.Tab
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var printJob: PrintJob? = null

    companion object{
        var tabsList: ArrayList<Tab> = ArrayList()
        private var isFullscreen: Boolean = true
        var isDesktopSite: Boolean = false
        var bookmarkList: ArrayList<Bookmark> = ArrayList()
        var bookmarkIndex: Int = -1
        lateinit var myPager: ViewPager2
        lateinit var tabsBtn: MaterialTextView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}