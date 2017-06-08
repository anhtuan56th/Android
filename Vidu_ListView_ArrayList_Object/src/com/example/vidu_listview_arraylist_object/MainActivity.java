package com.example.vidu_listview_arraylist_object;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
	EditText editId, editName;
	Button btnNhap;
	RadioGroup radgroup;
	ListView lvNhanvien;
	ArrayList<Employee>arrEmployee = new ArrayList<Employee>();
	ArrayAdapter<Employee>adapter = null;
	// Khai báo 1 employee object
	Employee employee = null;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editId = (EditText)findViewById(R.id.editMa);
        editName = (EditText)findViewById(R.id.editTen);
        btnNhap = (Button)findViewById(R.id.radiogroud1);
        radgroup = (RadioGroup)findViewById(R.id.lvnhanvien);
        
        //Đưa data source là các employee vào Adapter 
        adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, arrEmployee);
        
        //Đưa adapter vào ListView
        lvNhanvien.setAdapter(adapter);
        btnNhap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				processNhap();
			}
		});
	}
	
	//Xử lý sự kiện nhập
	public void processNhap(){
		// Lấy ra đúng id của radiobutton đc check
		int radId = radgroup.getCheckedRadioButtonId();
		String id = editId.getText()+ "";
		String name = editName.getText() + "";
		if(radId == R.id.radChinhthuc){
			//tạo instance là Fulltime
			employee = new EmployeeFullTime();
		}
		else {
			// tạo instance là Parttime
			employee = new EmployeePartTime();
		}
		
		//đều là employee nên các hàm dưới là hiển nhiên
		employee.setId(id);
		employee.setName(name);
		
		//đưa employee vào ArrayList
		arrEmployee.add(employee);
		
		//update giao diện
		adapter.notifyDataSetChanged();
	}
}
