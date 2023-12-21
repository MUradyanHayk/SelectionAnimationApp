package com.example.selectionanimationapp_2024.item

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.selectionanimationapp_2024.R
import com.example.selectionanimationapp_2024.model.MessageModel

class ConversationItemView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private var textView: TextView? = null
    private var textViewLayoutParams: LayoutParams? = null

    init {
        createTextView()
    }

    private fun createTextView() {
        textView = TextView(context)
        textView?.text = "sdjsdkljf klsdf"
        textView?.setTextColor(ContextCompat.getColor(context, R.color.teal_700))
        textView?.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 26f)
        val params = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        textView?.layoutParams = params
        textViewLayoutParams = params
        addView(textView)
    }

    fun configure(model: MessageModel) {
        if (model.isInComing) {
            textViewLayoutParams?.gravity = Gravity.START
        } else {
            textViewLayoutParams?.gravity = Gravity.END
        }
        textView?.text = model.message
    }
}