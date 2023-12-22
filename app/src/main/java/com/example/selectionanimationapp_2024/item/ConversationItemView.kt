package com.example.selectionanimationapp_2024.item

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins
import androidx.core.view.setPadding
import com.example.selectionanimationapp_2024.R
import com.example.selectionanimationapp_2024.model.MessageModel

class ConversationItemView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private var textView: TextView? = null
    private var textViewLayoutParams: LayoutParams? = null

    init {
        val params = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        layoutParams = params
        createTextView()
        setBackgroundColor(ContextCompat.getColor(context, R.color.transparent))
    }

    private fun createTextView() {
        textView = TextView(context)
        textView?.text = "sdjsdkljf klsdf"
        textView?.setTextColor(ContextCompat.getColor(context, R.color.teal_700))
        textView?.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 26f)
        textView?.setPadding(16)
        val params = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        params.setMargins(24)
        textView?.layoutParams = params
        textViewLayoutParams = params

        textView?.setBackground(ContextCompat.getDrawable(context, R.drawable.message_bg))
        addView(textView)
    }

    fun configure(model: MessageModel) {
        if (model.isInComing) {
            textViewLayoutParams?.gravity = Gravity.START
            textView?.gravity = Gravity.START
        } else {
            textViewLayoutParams?.gravity = Gravity.END
            textView?.gravity = Gravity.END
        }

        if (model.isSelected) {
            setBackgroundColor(ContextCompat.getColor(context, R.color.message_selected_item_bg_color))
        } else {
            setBackgroundColor(ContextCompat.getColor(context, R.color.transparent))
        }

        textView?.text = model.message
    }
}