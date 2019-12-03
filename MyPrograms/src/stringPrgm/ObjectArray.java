package stringPrgm;

public class ObjectArray 
{ 
	public static void main(String args[])
	{
		boolean b = false;
		String s = "Monika";
		Object[] ob = {12, 256l, 55.25, 3.3f, 'a', b, "Manoj", s};
		
		for(int i=0; i<ob.length; i++)
		{
			System.out.println(ob[i]);
		}
		//------------------------------------------------------
		System.out.println("\n\n");
		Object[] ob1 = new Object[5];
		ob1[0] = new Integer(10);
		ob1[1] = new String("MonMan");
		ob1[2] = new Student(26,"Manoj");
		ob1[3] = new Emp(27,"Monika");
		
		   for (Object a1:ob1) 
		   {
			   if (a1 instanceof Emp)    
			   { Emp e1 = (Emp)a1; 
			   System.out.println(e1.eid+"---"+e1.ename);    }  
			   
			   if (a1 instanceof Student)   
			   { Student s1 = (Student)a1;   
			   System.out.println(s1.sid+"---"+s1.sname);    }  
			   
			   if (a1 instanceof Integer)    
			   { System.out.println(a1);   }
			   
			   if (a1 instanceof String)
			   { System.out.println(a1);    }  
			   
			   if (a1==null)    
			   { System.out.println(a1);    }
		   }
			
	}

}
class Student
{
	int sid; String sname;
	Student(int sid, String sname)
	{ this.sid = sid; this.sname = sname;}
}
class Emp
{
	int eid; String ename;
	Emp(int eid, String ename)
	{ this.eid = eid; this.ename = ename;	}
}
