package labs.lab5;

public class Data {
	/**
	 * Computes the average of the measures of the given objects.
	 * 
	 * @param objects an array of objects
	 * @param meas    the measurer for the objects
	 * @return the average of the measures
	 */
	public static double average(Object[] objects, Measurer meas, Filter f) {
		double sum = 0;
		int len = 0;
		for (Object obj : objects) {
			if(f.accept(obj)) {
				sum = sum + meas.measure(obj);
				len++;
			}
		}
		if (objects.length > 0) {
			return sum / len;
		} else {
			return 0;
		}
	}

	/**
	 * Computes the maximum of the measures of the given objects.
	 * 
	 * @param objects an array of objects
	 * @param meas    the measurer for the objects
	 * @return the maximum of the measures, null if array is empty
	 */
	public static Object max(Object[] objects, Measurer meas, Filter f) {
		if (objects.length == 0) {
			return null;
		}
		Object max = objects[0];
		for (Object obj : objects) {
			if (f.accept(obj)&&meas.measure(obj) > meas.measure(max)) {
				max = obj;
			}
		}

		return max;
	}
}
