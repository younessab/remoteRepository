package edu.esprit.calculator;

public class calculator {
public Long add(Long... params){
	Long result= 0L;
	int baaaaaaaa;
	for(Long arg:params) {
		result += arg;
	}
	return result;
}
public Double divide(Double d1, Double d2){
	if(d2==0)
		throw new IllegalArgumentException("Can't divide by 0!!");
	return d1/d2;
}

}
