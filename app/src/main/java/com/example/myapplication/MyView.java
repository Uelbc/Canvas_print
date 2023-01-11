package com.example.myapplication;

        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.graphics.Path;
        import android.graphics.Rect;
        import android.graphics.RectF;
        import android.view.View;

public class MyView extends View {
    public MyView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawColor(Color.WHITE);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(200, 200, 150, paint);
        canvas.drawLine(200, 200, 500, 500, paint);
        int k = 10;
        for (int i =36; i>0; i-=1){
            canvas.drawLine(200, 200, 500, 500, paint);
            float rotate_center_x = 200;
            float rotate_center_y = 200;
            float rotate_angle = -k;
            canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        }
        paint.setColor(Color.rgb(00, 64, 00));
        Rect rect = new Rect(0, getBottom()-500, getWidth(), getBottom());
        canvas.drawRect(rect, paint);
        paint.setColor(Color.rgb(80, 40, 30));
        Rect rect1 = new Rect(getWidth()/2, getBottom()-300, getWidth()/2+30, getBottom()-200);
        canvas.drawRect(rect1, paint);
        paint.setColor(Color.GREEN);
        RectF oval = new RectF(getWidth()/2-100, getBottom()-800, getWidth()/2+130, getBottom()-300);
        canvas.drawOval(oval, paint);
        paint.setColor(Color.GRAY);
        Rect rect2 = new Rect(getWidth()/3*2, getBottom()-300, getWidth()/3*2+20, getBottom()-250);
        Rect rect3 = new Rect(getWidth()/3*2+100, getBottom()-300, getWidth()/3*2+120, getBottom()-250);
        Rect rect4 = new Rect(getWidth()/3*2-50, getBottom()-320, getWidth()/3*2+170, getBottom()-300);
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect3, paint);
        canvas.drawRect(rect4, paint);
        paint.setColor(Color.rgb(80, 40, 30));
        Rect house = new Rect(100, getBottom()-600, 400, getBottom()-300);
        canvas.drawRect(house, paint);

        int x1=100;
        int y1=getBottom()-600;
        int x2=250;
        int y2=getBottom()-850;
        int x3=400;
        int y3=getBottom()-600;
        Path path = new Path();
        path.moveTo(x1, y1);
        path.lineTo(x2, y2);
        path.moveTo(x2, y2);
        path.lineTo(x3, y3);
        path.moveTo(x3, y3);
        path.lineTo(x1, y1);
        path.close();
        paint.setStrokeWidth(2);
        paint.setColor(Color.rgb(80, 40, 30));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawPath(path, paint);
    }
}
