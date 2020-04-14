package com.hf.mycustomcardview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.Nullable;

/**
 * @author h.f
 * @description:
 * @apiNote:
 * @date :2019/12/11 16:13
 */
interface CardViewImpl {
    void initialize(CardViewDelegate var1, Context var2, ColorStateList var3, float var4, float var5, float var6, int var7, int car8);

    void setRadius(CardViewDelegate var1, float var2);

    float getRadius(CardViewDelegate var1);

    void setElevation(CardViewDelegate var1, float var2);

    float getElevation(CardViewDelegate var1);

    void initStatic();

    void setMaxElevation(CardViewDelegate var1, float var2);

    float getMaxElevation(CardViewDelegate var1);

    float getMinWidth(CardViewDelegate var1);

    float getMinHeight(CardViewDelegate var1);

    void updatePadding(CardViewDelegate var1);

    void onCompatPaddingChanged(CardViewDelegate var1);

    void onPreventCornerOverlapChanged(CardViewDelegate var1);

    void setBackgroundColor(CardViewDelegate var1, @Nullable ColorStateList var2);

    ColorStateList getBackgroundColor(CardViewDelegate var1);
}
