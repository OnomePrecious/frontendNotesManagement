public class Human {
	private String name;
	private int age;
	private int height;


// method:  access-modifier , return type , methodName, () { }

// mutators (changes states) return type is alwalys void
// accessors (fetch states) return type is the variable type

public void setName(String name){
	this.name = name;
}
public void setAge(int age){
	this.age = age;
}
public void setHeight(int height){
	this.height = height;
}

public String getName(){
	return name;
}


public int getAge(){
	return age;
}

public int getHeight(){
	return height;
}

}