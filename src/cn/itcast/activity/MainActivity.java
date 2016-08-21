package cn.itcast.activity;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   public void click1(View v){
	   Intent intent =new Intent();
	   //设置打电话的动作
	   intent.setAction(intent.ACTION_CALL);
	   //设置拨打的数据
	   intent.setData(Uri.parse("tel:"+119));
	   //开启activity
	   startActivity(intent);
	   
	   
   }
   public void click2(View v){
//	   隐式意图实现界面跳转
	   Intent intent =new Intent();
	   intent.setAction("android.intent.action.test");
	   intent.addCategory("android.intent.category.DEFAULT");
	   intent.setData(Uri.parse("my:"+123));

	   startActivity(intent);
	   
   }
   public void click3(View v){
	   //显式意图实现界面跳转(只需要加包名类名)
	   Intent intent =new Intent(this,Test3.class);
	   startActivity(intent);
	   
   }
}
