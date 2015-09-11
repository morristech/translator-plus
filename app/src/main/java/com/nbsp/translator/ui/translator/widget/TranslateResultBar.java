package com.nbsp.translator.ui.translator.widget;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nbsp.translator.R;

/**
 * Created by Dimorinny on 11.09.15.
 */
public class TranslateResultBar {

    private String mCurrentResult;

    private LinearLayout mContainer;
    private TextView mTranslateResultTextView;
    private View.OnClickListener mOnClickListener;

    public TranslateResultBar(LinearLayout widget) {
        mContainer = widget;
        initViews();
    }

    public void setOnCLickListener(View.OnClickListener onCLickListener) {
        mOnClickListener = onCLickListener;

        if (mContainer != null) {
            mContainer.setOnClickListener(mOnClickListener);
        }
    }

    public void setWaitingStatus() {
        mTranslateResultTextView.append("...");
    }

    public void setCurrentResult(String result) {
        if (mContainer.getVisibility() == View.GONE) {
            mContainer.setVisibility(View.VISIBLE);
        }

        mCurrentResult = result;
        mTranslateResultTextView.setText(result);
    }

    public String getCurrentResult() {
        return mCurrentResult;
    }

    private void initViews() {
        mTranslateResultTextView = (TextView) mContainer.findViewById(R.id.language_result_textview);
    }
}
