package list_test;
public interface IList {
	public void clear(); 
	public boolean isEmpty(); 
	public int length();
    public Object get(int i) throws Exception;
    //0��i��length()-1,���iֵ���ڴ˷�Χ���׳��쳣
    public void insert(int i, Object x) throws Exception;
    // 0��i��length()�����iֵ���ڴ˷�Χ���׳��쳣
    public void remove(int i) throws Exception;
    // 0��i��length()- 1,���iֵ���ڴ˷�Χ���׳��쳣
    public int indexOf(Object x);
    public void display();
}
