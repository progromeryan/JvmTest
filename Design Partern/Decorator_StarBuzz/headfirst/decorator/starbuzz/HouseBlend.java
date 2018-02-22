package headfirst.decorator.starbuzz;
/**
 * @FileName : (HouseBlend.java)
 * @description :  组合咖啡
 */
public class HouseBlend extends Beverage
{
	public HouseBlend()
	{
		description = "House Blend Coffee";
	}

	@Override
	public double cost()
	{
		return .89;
	}

}
