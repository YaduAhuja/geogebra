package geogebra.common.kernel.commands;

import geogebra.common.kernel.Kernel;
import geogebra.common.kernel.arithmetic.NumberValue;
import geogebra.common.kernel.geos.GeoElement;
/**
 * DivisorsList[number]
 * @author zbynek
 *
 */
public class CmdDivisorsList extends CmdOneNumber {
	/**
	 * Creates new command processor
	 * @param kernel kernel
	 */
	public CmdDivisorsList(Kernel kernel) {
		super(kernel);
	}

	@Override
	protected GeoElement getResult(NumberValue num,String label){
		return kernelA.DivisorsList(label, num);
	}

}
