package ExceptionExamples;

import rachanajava.Employee;

public class ExceptionEx {

	private Employee employee;

	public static void main(String[] args) {

		ExceptionEx ex = new ExceptionEx();
		try {
			ex.execute();
		} catch (IncorrectException e) {
			System.out.println("id was incorrect");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		} finally {
			System.out.println("i always get executed");
		}

		System.out.println("after execute in main");
	}

	public void execute() throws Exception{

		if (employee.getId() < 0) {
			// Throwable e = new NullPointerException;
			RuntimeException e = new IncorrectException("id cannot be negative");
			throw e;
		}
		// int id = employee.getId();
		// System.out.println(id);

	}

}
