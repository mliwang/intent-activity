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
	   //���ô�绰�Ķ���
	   intent.setAction(intent.ACTION_CALL);
	   //���ò��������
	   intent.setData(Uri.parse("tel:"+119));
	   //����activity
	   startActivity(intent);
	   
	   
   }
   public void click2(View v){
//	   ��ʽ��ͼʵ�ֽ�����ת
	   Intent intent =new Intent();
	   intent.setAction("android.intent.action.test");
	   intent.addCategory("android.intent.category.DEFAULT");
	   intent.setData(Uri.parse("my:"+123));

	   startActivity(intent);
	   
   }
   public void click3(View v){
	   //��ʽ��ͼʵ�ֽ�����ת(ֻ��Ҫ�Ӱ�������)
	   Intent intent =new Intent(this,Test3.class);
	   startActivity(intent);
	   
   }
}
