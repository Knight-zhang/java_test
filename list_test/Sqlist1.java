package list_test;
public  class Sqlist1 implements IList{
	private Object[] listElem;
	private int curlen;
	public Sqlist1(int maxSize) {
		curlen = 0;
		listElem = new Object[maxSize];
	}
	public void clear() {
		curlen = 0;
	}
	public boolean isEmpty() {
		return curlen == 0;
	}
	public int length() {
		return curlen;
	}
	public Object get(int i) throws Exception{
		if(i<0 || i>curlen -1) 
			throw new Exception("�� "+ i +"��Ԫ�ز�����");
		return listElem[i];
	}
	public void insert(int i,Object x) throws Exception{
		if(curlen == listElem.length)
			throw new Exception("˳�������");
		if(i<0 || i>curlen) 
			throw new Exception("����λ�ò��Ϸ�");
		for(int j = curlen;j>i;j--)
			listElem[j]=listElem[j-1];
		listElem[i]=x;
		curlen++;
	}
    public void remove(int i) throws Exception{
		if(i<0 || i>curlen-1)
        throw new Exception("ɾ��λ�ò��Ϸ�"); 
		
		for(int j = i;j<curlen-1;j++)
			listElem[j]=listElem[j+1];
		    curlen--;
	}

    public int indexOf(Object x) {
	    int j=0;
	    while(j<curlen&&!listElem[j].equals(x))
		    j++;
	    if(j<curlen)
		    return j;
	    else
		    return -1;
    }
    public void display() {
	    for(int j = 0;j<curlen;j++)
		    System.out.println(listElem[j] + " ");
	    System.out.println();
    }
}

