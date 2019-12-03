package DuringUttara;
class MetVsAllDt
{
	void m1(byte a)
	{ System.out.println("Byte value-->"+a); }
	void m2(short b )
	{ System.out.println("short value-->"+b);  }
	void m3(int c)
	{ System.out.println("int value-->"+c);  }
	void m4(long d)
	{ System.out.println("long value is-->"+d);  }
	void m5(float e)
	{ System.out.println("float value is-->"+e);  }
	void m6(double f)
	{ System.out.println("double value is-->"+f); }
	void m7(char g)
	{ System.out.println("character value is-->"+g); }
	void m8(boolean h)
	{ System.out.println("Boolean value is-->"+h); }

	public static void main(String[] args)
	{
		MetVsAllDt t=new MetVsAllDt();
		t.m1((byte)10);
		t.m2((short)20);
		t.m3(30);
		t.m4(40);
		t.m5(10.6f);
		t.m6(20.5);
		t.m7('a');
		t.m8(true);
	}
}