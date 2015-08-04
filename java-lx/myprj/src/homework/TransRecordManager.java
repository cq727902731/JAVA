package homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

public interface TransRecordManager {
	
	
    /**
    * 记录数组
    */
    

    /**
    * 加载数据
    * @param in - 数据流
    * @return
    * @throws - 解析过程中IO错误
    */
    public void load(InputStream in) throws IOException;

    /**
    * 加载数据
    * @param fileName - 包含记录数据的文件名
    * @return
    * @throws - 解析过程中IO错误
    */
    public void load(String fileName) throws IOException;

    /**
    * 取所有记录
    * @return 所有记录数组或null
    */
    public TransRecord[] getAll();

    /**
    * 按客户号查询记录
    * @param customerNumber - 客户号
    * @return 符合条件的记录数组或null
    */
    public TransRecord[] findByCustomerNumber(String customerNumber);

    /**
    * 按日期段查询记录
    * @param start - 开始日期
    * @param end - 结束日期
    * @return 符合条件的记录数组或null
    */
    public TransRecord[] findByDate(String start, String end);

    /**
    * 取得总金额
    * @return 总金额
    */
    public BigDecimal totalAmount();

    /**

    * 按金额排序
    * @return 按金额升序排序的结果
    */
    public TransRecord[] sortByAmount();

    /**
    * 打印  
    * @param out - 输出流
    */
    public void print(OutputStream out);
}
