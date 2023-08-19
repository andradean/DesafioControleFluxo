package utils;


public class ParametrosInvalidosException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(){
        super();
    }
	
	 public ParametrosInvalidosException(String msg){
	        super(msg);
	        System.out.println("O segundo parâmetro deve ser maior que o primeiro");

	    }
}
