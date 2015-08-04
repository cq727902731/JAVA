package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class TransRecordManagerImpl implements TransRecordManager{

	
	private TransRecord[] records;
	
	public TransRecordManagerImpl() {
		// TODO Auto-generated constructor stub
		super();
		records = new TransRecord[10];
	}
	public TransRecordManagerImpl(TransRecord[] records) {
		// TODO Auto-generated constructor stub
		super();
		records = new TransRecord[10];
	}
	
	
	@Override
	public void load(InputStream in) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String data = null;
		int i = 0;
		while((data = br.readLine())!= null){
			if(!"#".equals(String.valueOf(data.charAt(0)))){
				String datas[] = data.split("`");
				try {
					TransRecord tr = 
							new TransRecord(datas[0],datas[1],datas[2],datas[3],datas[4],
									new SimpleDateFormat("yyyyMMddHHmmss").parse(datas[5]),new BigDecimal(datas[6]));
					records[i++] = tr;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//System.out.println(data);
		}
		System.out.println(Arrays.toString(records));
		br.close();
	}
	public static void main(String[] args) {
		TransRecordManager trm = new TransRecordManagerImpl();
		try {
			trm.load("d:\\data.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public TransRecord[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransRecord[] findByCustomerNumber(String customerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransRecord[] findByDate(String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal totalAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransRecord[] sortByAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print(OutputStream out) {
		// TODO Auto-generated method stub
		
	}

}
