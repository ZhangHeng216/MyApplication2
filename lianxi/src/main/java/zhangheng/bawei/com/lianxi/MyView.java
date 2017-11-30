package zhangheng.bawei.com.lianxi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 张恒 on 2017/11/30.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);// 设置红色
        //画圆
        p.setStyle(Paint.Style.STROKE);
        canvas.drawText("画圆：", 10, 20, p);// 文本
        canvas.drawCircle(70, 50, 20, p);//小圆
        canvas.drawCircle(170, 50, 50, p);// 大圆
        p.setAntiAlias(true);// 设置画笔的锯齿效果。 true是去除，
        //线,斜线
        canvas.drawText("画线,斜线:", 10, 120, p);
        p.setColor(Color.BLACK);
        p.setStrokeWidth(5);
        canvas.drawLine(70, 120, 170, 120, p);//直线
        canvas.drawLine(200, 120, 290, 80, p);//弧线
        //笑脸
        p.setStrokeWidth(0);
        p.setStyle(Paint.Style.STROKE);//空心设置
        RectF oval1 = new RectF(135, 25, 165, 45);
        canvas.drawArc(oval1, 0, 180, false, p);//小弧形
        oval1.set(178, 25, 205, 45);
        canvas.drawArc(oval1, 0, 180, false, p);//小弧形
        oval1.set(145, 65, 195, 80);
        canvas.drawArc(oval1, 180, 180, false, p);//小弧形
        //正方形
        p.setColor(Color.RED);
        canvas.drawText("正方形:", 10, 150, p);
        p.setStyle(Paint.Style.FILL);//填满
        canvas.drawRect(60, 150, 110, 200, p);
        //长方形
        canvas.drawText("长方形:", 10, 210, p);
        canvas.drawRect(60, 220, 180, 280, p);
        //扇形
        canvas.drawText("扇形:", 10, 290, p);
        RectF oval2 = new RectF(60, 300, 200, 450);// 设置个新的长方形，扫描测量
        canvas.drawArc(oval2, 30, 60, true, p);
        RectF oval3 = new RectF(60, 300, 200, 450);// 设置个新的长方形，扫描测量
        canvas.drawArc(oval3, 150, 60, true, p);
        RectF oval4 = new RectF(60, 300, 200, 450);// 设置个新的长方形，扫描测量
        canvas.drawArc(oval4, 270, 60, true, p);
        //三角形
        canvas.drawText("三角形:",10,460,p);
        Path path = new Path();
        path.moveTo(70,470);
        path.lineTo(100,520);
        path.lineTo(50,520);
//        path.close();
        canvas.drawPath(path,p);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
