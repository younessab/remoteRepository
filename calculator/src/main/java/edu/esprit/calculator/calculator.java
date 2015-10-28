package edu.esprit.calculator;
import java.util.List;

public class calculator {
public Long add(Long... params){
	Long result= 0L;
	for(Long arg:params) {
		result += arg;
	}
	return result;
}
}
