package org.paradrops.colorfiltersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.paradrops.colorfilter.ColorFilter

class MainActivity : AppCompatActivity() {

    private var changedImage = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (changedImage) {
                imageView.colorFilter = null

                imageView.setImageResource(R.drawable.cat03)
            } else {
                imageView.colorFilter = ColorFilter().monochrome()
            }
            changedImage = !changedImage
        }
    }
}
