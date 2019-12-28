package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView tCurrent;
    private TextView tStatus;
    private String imgPath;
    private ImageView imageView;
    private File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.img12);
        test3();
//        test2();
//          flower();
//          music();
//          test();
//            test1();
    }
    public void test3(){
        ImageView[] imgs=new ImageView[12];
        int[] imagepath=new int[]{
            R.mipmap.img01,R.mipmap.img02,R.mipmap.img03,R.mipmap.img04,
                R.mipmap.img05,R.mipmap.img06,R.mipmap.img07,R.mipmap.img08,
                R.mipmap.img09,R.mipmap.img10,R.mipmap.img11,R.mipmap.img12
        };
        GridLayout GL=(GridLayout)findViewById(R.id.G1layout);
        ArrayList<String> AL=getScreenSize(MainActivity.this);

        int width= Integer.parseInt(AL.get(0))-36;
        int height=Integer.parseInt(AL.get(1))-36;

        for (int i=0;i<imagepath.length;i++){
            imgs[i]=new ImageView(MainActivity.this);
            imgs[i].setImageResource(imagepath[i]);
            imgs[i].setPadding(2,2,2,2);
            ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(width/2,height/7);
            imgs[i].setLayoutParams(params);
            GL.addView(imgs[i]);

        };

//        Toast t=Toast.makeText(MainActivity.this,"显示view",Toast.LENGTH_SHORT);
//        t.setView(imgs[11]);
//        t.show();

    }
    public void show(String str){
        makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }
    public ArrayList<String> getScreenSize(Context context){
        ArrayList<String> AL=new ArrayList<>();
        Display display=getDisplay(context);
        Point point=new Point();
        try{
            display.getSize(point);
        }catch(Exception e){
            e.printStackTrace();
        }

        AL.add(String.valueOf(point.x));
        AL.add(String.valueOf(point.y));
        return AL;
    }
    private static Display getDisplay(Context context) {
        WindowManager wm;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            wm = activity.getWindowManager();
        } else {
            wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        }
        if (wm != null) {
            return wm.getDefaultDisplay();
        }
        return null;
    }


//    public void flower(){
//        setContentView(R.layout.activity_main);
//        FrameLayout Flayout=(FrameLayout)findViewById(R.id.myLayout);
//        final flower flowers=new flower(this);
//        flowers.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                flowers.bitX=event.getX();
//                flowers.bitY=event.getY();
//                flowers.invalidate();
//                return true;
//            }
//        });
//        Flayout.addView(flowers);
//    }
//    public void music(){
////        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.music);
////        this.getWindow().setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,android.R.drawable.dark_header);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        seekBar=(SeekBar)findViewById(R.id.seekBar);
//        tStatus=(TextView)findViewById(R.id.textView6);
//        seekBar.setProgress(30);
//        tStatus.setText("进度："+seekBar.getProgress());
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
////                tStatus.setText("进度："+progress);
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//                tStatus.setText("进度："+seekBar.getProgress()+"//n"+"---移动中--");
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//                tStatus.setText("进度："+seekBar.getProgress()+"//n"+"---停止移动--");
//            }
//        });
//
//
//
//    }
//    public void test(){
//        setContentView(R.layout.mysurface);
//        //???不懂在干嘛，书里资料不全
//    }
//    public void test1(){
////     setContentView(R.layout.activity_main);
////        Uri uri=Uri.parse("http://www.baidu.com");
////        Intent it=new Intent(Intent.ACTION_VIEW,uri);
////        startActivity(it);
////        File[] data= Environment.getDataDirectory().listFiles();
////        String str=data[0].toString();
////        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
////        setContentView(R.layout.camera_system_demo);
////        imgPath = android.os.Environment.getExternalStorageDirectory().getPath();
////        imageView =(ImageView)this.findViewById(R.id.imageView1);
////        //以当前时间作为照片名字,其中yyyy表示年,MM表示月,dd表示日
////        //hh表示时,mm表示分,ss表示秒
////        SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddhhmmss");
////        Date curDate=new Date(System.currentTimeMillis());
////        String str=formatter.format(curDate);
////        imgPath=imgPath+"/"+str+".jpeg";
////
////        file=new File(imgPath);
////        Uri uri=Uri.fromFile(file);
////        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
////        intent.putExtra(MediaStore.EXTRA_OUTPUT,uri);
////        //打开系统相机
////        startActivityForResult(intent,10);
//    }
//    protected void onActivityResult(int requestCode,int resultCode,Intent data){
//        if(file.exists()){
//            imageView.setImageURI(Uri.fromFile(file));
//        }
//    }
//    public void test2(){
//        setContentView(R.layout.music);
//        ClipboardManager clipboardManager=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
//        clipboardManager.setText("设置");
//        WindowManager windowManager=(WindowManager)getSystemService(Context.WINDOW_SERVICE);
//        setTitle(String.valueOf(windowManager.getDefaultDisplay().getWidth())+"*"+windowManager.getDefaultDisplay().getState());
//    }
}




