package com.hf.mycustomcardview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.RequiresApi;

/**
 * @author h.f
 * @description:
 * @apiNote:
 * @date :2019/12/11 16:12
 */
@RequiresApi(17)
class CardViewApi17Impl extends CardViewBaseImpl {
    CardViewApi17Impl() {
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {
            public void drawRoundRect(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
                canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
            }
        };
    }
}
