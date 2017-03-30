package cn.com.igdj.library.utils;

import android.content.Context;

/**
 * ScreenUtils
 * <ul>
 * <strong>Convert between dp and sp</strong>
 * <li>{@link ScreenUtil#dpToPx(Context, float)}</li>
 * <li>{@link ScreenUtil#pxToDp(Context, float)}</li>
 * </ul>
 * 
 */
public class ScreenUtil {

	public static float dpToPx(Context context, float dp) {
		if (context == null) {
			return -1;
		}
		return dp * context.getResources().getDisplayMetrics().density;
	}

	public static float pxToDp(Context context, float px) {
		if (context == null) {
			return -1;
		}
		return px / context.getResources().getDisplayMetrics().density;
	}

	public static int dpToPxInt(Context context, float dp) {
		return (int) (dpToPx(context, dp) + 0.5f);
	}

	public static int pxToDpCeilInt(Context context, float px) {
		return (int) (pxToDp(context, px) + 0.5f);
	}

	public static int px2sp(Context context, float pxValue) {
		return (int) (pxValue / context.getResources().getDisplayMetrics().density + 0.5f);
	}

	public static int sp2px(Context context, float spValue) {
		return (int) (spValue * context.getResources().getDisplayMetrics().density + 0.5f);
	}
}