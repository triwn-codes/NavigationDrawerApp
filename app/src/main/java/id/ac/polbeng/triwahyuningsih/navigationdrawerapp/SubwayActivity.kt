package id.ac.polbeng.triwahyuningsih.navigationdrawerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.triwahyuningsih.navigationdrawerapp.databinding.ActivitySubwayBinding
class SubwayActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubwayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubwayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}