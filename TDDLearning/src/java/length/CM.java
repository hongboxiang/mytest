package length;

/**
 * Created by 10180885 on 16-5-6.
 */
public class CM extends Length {
	public CM(int length) {
		super(length);
	}

	@Override
	public int base() {
		return 1 * length;
	}

	@Override
	public String unitName() {
		return "cm";
	}
}
