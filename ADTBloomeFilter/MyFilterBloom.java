package ADTBloomeFilter;

import java.util.BitSet;

public class MyFilterBloom<T> extends ADTBloomeFilter<T>{

	private int size;
	private BitSet bs;
	
	public MyFilterBloom(int size) {
		super(size);
		// TODO Auto-generated constructor stub
		this.size = size;
		bs = new BitSet(size);
	}

	@Override
	public void put(T value) {
		// TODO Auto-generated method stub
		int hash1 = hash1(String.valueOf(value));
		int hash2 = hash2(String.valueOf(value));
		this.bs.set(hash1);
		this.bs.set(hash2 );
	}

	   public int hash1(String str1)
	      {
	        int res = 0;
	        for(int i=0; i<str1.length(); i++)
	        {
	            int code = (int)str1.charAt(i);
	            if(i == 0)res = 0;
	            res *= 17;
	            res += code;
	            res%=this.size;
	        }
	        return res;
	      }
	      public int hash2(String str1)
	      {
	    	  int res = 0;
	          for(int i=0; i<str1.length(); i++)
	          {
	              int code = (int)str1.charAt(i);
	              if(i == 0)res = 0;
	              res *= 223;
	              res += code;
	              res %= this.size;
	          }
	          return res;

	      }
	@Override
	public boolean get(T value) {
		// TODO Auto-generated method stub
		  int hash1 = hash1(String.valueOf(value));
          int hash2 = hash2(String.valueOf(value));
          if(!this.bs.get(hash2) || !bs.get(hash2))
          		return false;
        return true;
	}

}
