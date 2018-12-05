package practice14.common;

public class JavaCourse implements Course {
	String courseName= PREFIX+"Java";
	String[] courseUnit=
		{"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
	public JavaCourse(String courseName,String[] courseUnit) {
		this.courseName=courseName;
		this.courseUnit=courseUnit;
	}
	public String getCourseName() {
		return this.courseName;
	}

	public String[] getCourseUnit() {
		return this.courseUnit;
	}


}
