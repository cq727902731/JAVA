import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat; //Format DataFormat SimpleDateFormat
import java.util.Date;  //Date,Calendar
import java.io.File;


public class DirDemo{
		
	public static void main(String[] args){    
		BufferedReader br = null;
		File file = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			//��ȷ�Ļ�ȡ�û���Ҫ�鿴��·������
			String data = null;
			do{
				System.out.println("��������Ҫ�鿴����ȷ·����");
				file = new File(br.readLine());
			}while(!(file.isDirectory() && file.exists()));
			File[] files = file.listFiles();
			for (int i = 0;i < files.length ;i++ ){
				File tmpFile = files[i];
				System.out.println(sdf.format(new Date(tmpFile.lastModified())) + " " + 
					(tmpFile.isDirectory() ? "[Ŀ¼]" : "[�ļ�]") + " " +
					tmpFile.getName() + " " + tmpFile.length()); //�ļ�����
				
			}
			
		}
		catch (IOException e){			
				e.printStackTrace();
		}finally{
			try{
				if (br != null){
					br.close();
				}
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}