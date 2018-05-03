package net.hudup.core.evaluate;

import java.util.List;

import net.hudup.core.logistic.Vector;

/**
 * This abstract class represents a cosine of two arrays of real numbers (cosine of two real vectors) as a {@link MetricValue}.
 * Note, {@link MetricValue} interface represents value of a metric, which can be anything.
 * Because this class extends directly {@link TwoArrayMetricValue}, it also contains two arrays of real numbers (two real vectors).
 * Moreover, its {@link #value()} method returns the cosine of such two vectors.
 * 
 * @author Loc Nguyen
 * @version 10.0
 *
 */
public class CosineTwoArrayMetricValue extends TwoArrayMetricValue {

	
	/**
	 * Serial version UID for serializable class. 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * Default constructor.
	 */
	public CosineTwoArrayMetricValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructor with two arrays of real numbers.
	 * @param array0 first array of of real numbers.
	 * @param array1 second array of of real numbers.
	 */
	public CosineTwoArrayMetricValue(List<Float> array0, List<Float> array1) {
		super(array0, array1);
		// TODO Auto-generated constructor stub
	}


	@Override
	public float value() {
		// TODO Auto-generated method stub
		Vector v0 = new Vector(array0);
		Vector v1 = new Vector(array1);
		
		return v0.cosine(v1);
	}

	
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new CosineTwoArrayMetricValue(this.array0, this.array1);
	}


}
