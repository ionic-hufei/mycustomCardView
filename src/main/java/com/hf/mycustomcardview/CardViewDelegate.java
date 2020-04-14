package com.hf.mycustomcardview;

import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * @author h.f
 * @description:
 * @apiNote:
 * @date :2019/12/11 16:13
 */
interface CardViewDelegate {
    void setCardBackground(Drawable var1);

    Drawable getCardBackground();

    boolean getUseCompatPadding();

    boolean getPreventCornerOverlap();

    void setShadowPadding(int var1, int var2, int var3, int var4);

    void setMinWidthHeightInternal(int var1, int var2);

    View getCardView();
}
