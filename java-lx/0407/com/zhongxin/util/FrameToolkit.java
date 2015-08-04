package com.zhongxin.util;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
*
*  @author James.Cui
*  @since 1.5
*
*/

public class FrameToolkit{
	/**
	*	@param width 创建窗体的宽度
	*	@param height 创建窗体的高度
	*	@return Point 该窗体在屏幕中央的绘制坐标的Point对象
	*
	*/
	public static Point getFrameInScreenCenterPoint(int width,int height){
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension winDimension = tool.getScreenSize();
		int x = (int)Math.round((winDimension.getWidth() - width)/2);
		int y = (int)Math.round((winDimension.getHeight() - height)/2);
		Point p = new Point(x,y);
		return p;
	}

}