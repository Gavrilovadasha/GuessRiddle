package da.gavrilova.guessriddle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import da.gavrilova.guessriddle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }


    }
}