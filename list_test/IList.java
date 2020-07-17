package list_test;
public interface IList {
	public void clear(); 
	public boolean isEmpty(); 
	public int length();
    public Object get(int i) throws Exception;
    //0≤i≤length()-1,如果i值不在此范围则抛出异常
    public void insert(int i, Object x) throws Exception;
    // 0≤i≤length()。如果i值不在此范围则抛出异常
    public void remove(int i) throws Exception;
    // 0≤i≤length()- 1,如果i值不在此范围则抛出异常
    public int indexOf(Object x);
    public void display();
}
