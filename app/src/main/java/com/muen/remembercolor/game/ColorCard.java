package com.muen.remembercolor.game;

/**
 * 颜色板
 */
public class ColorCard implements Cloneable{
    private int color = 0xfffe44fe;
    private boolean isFace = false;
    private boolean isShow = true;
    private PicPoint point;



    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isFace() {
        return isFace;
    }

    public void setIsFace(boolean isFace) {
        this.isFace = isFace;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setIsShow(boolean isShow) {
        this.isShow = isShow;
    }

    public PicPoint getPoint() {
        return point;
    }

    public void setPoint(PicPoint point) {
        this.point = point;
    }

    @Override
    public ColorCard clone(){
        ColorCard c = null;
        try {
            c = (ColorCard)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return c;
    }
}
