package homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

public interface TransRecordManager {
	
	
    /**
    * ��¼����
    */
    

    /**
    * ��������
    * @param in - ������
    * @return
    * @throws - ����������IO����
    */
    public void load(InputStream in) throws IOException;

    /**
    * ��������
    * @param fileName - ������¼���ݵ��ļ���
    * @return
    * @throws - ����������IO����
    */
    public void load(String fileName) throws IOException;

    /**
    * ȡ���м�¼
    * @return ���м�¼�����null
    */
    public TransRecord[] getAll();

    /**
    * ���ͻ��Ų�ѯ��¼
    * @param customerNumber - �ͻ���
    * @return ���������ļ�¼�����null
    */
    public TransRecord[] findByCustomerNumber(String customerNumber);

    /**
    * �����ڶβ�ѯ��¼
    * @param start - ��ʼ����
    * @param end - ��������
    * @return ���������ļ�¼�����null
    */
    public TransRecord[] findByDate(String start, String end);

    /**
    * ȡ���ܽ��
    * @return �ܽ��
    */
    public BigDecimal totalAmount();

    /**

    * ���������
    * @return �������������Ľ��
    */
    public TransRecord[] sortByAmount();

    /**
    * ��ӡ  
    * @param out - �����
    */
    public void print(OutputStream out);
}
