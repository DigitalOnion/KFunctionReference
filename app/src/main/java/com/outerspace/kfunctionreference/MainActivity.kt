package com.outerspace.kfunctionreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val processor : Processor = Processor();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //    notice the processIt method from the processor object. we are passing
    //    setText for processIt to dump the result on it. In this way, the Processor
    //    class can be isolated from the implementation and tested.
    fun onClickProcessIt(view : View) {
        processor.processIt(enter_text.text.toString(), result_text::setText)
    }
}
