package practice14.common;

public class DBCourse implements Course{
	String courseName= PREFIX+"DB基礎";
	String[] courseUnit= {"DB基礎","SQL基礎","正規化","SQL応用"};

	public DBCourse(String courseName,String[] courseUnit) {
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
