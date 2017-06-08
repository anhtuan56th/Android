package tuannva.vidu_listview_xml_array;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    final String arr[]=getResources().getStringArray(R.array.myarray);
       // Toast.makeText(this, arr[0], Toast.LENGTH_LONG).show();
    // // Khoi tao data source cho mang arr
     final String arr[]={"Teo","Ty","Bin","Bo"};
    // Lay doi tuong Listview dua vao id
    ListView lv =(ListView) findViewById(R.id.lvperson);
//    // Gan data source vao arrayAdapter
    ArrayAdapter<String>adapter= new ArrayAdapter<String>
    (this, android.R.layout.simple_list_item_1, arr);
//    // Dua data source vao Listview
    lv.setAdapter(adapter);

//    final TextView txt=(TextView) findViewById(R.id.txtselection);
//    //Thiet lap event cho Listview, khi chon ptu nao thi hien len Textview
//    lv.setOnItemClickListener(
//    	 new AdapterView.OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//				// TODO Auto-generated method stub
//				txt.setText("position :"+arg2+" ; value ="+arr[arg2]);
//			}	
//   		 });
	 };
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
