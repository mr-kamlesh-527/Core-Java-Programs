package classjbk;

class objectcloning implements Cloneable {
	int rollno;
	String name;

	objectcloning(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			objectcloning s1 = new objectcloning(101, "kamlesh");

			objectcloning s2 = (objectcloning) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}

	}
}
