package edu.esprit.calculator;

public class calculator {
public Long add(Long... params){
	int tro;
	Long result= 0L;
	int baaaaaaaa;
	for(Long arg:params) {
		result += arg;
	}
	return result;
}
abdou

public Double divide11(Double d1,Double d2){
	
	if(d2==0)
		throw new IllegalArgumentException("can't divide by 0!!");
	return d1/d2;
	
}

}
