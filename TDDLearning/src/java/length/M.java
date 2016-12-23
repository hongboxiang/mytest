package length;

/**
 * Created by 10180885 on 16-5-6.
 */
public class M extends Length {
	public M(int length) {
		super(length);
	}

	@Override
	public int base() {
		return 100 * length;
	}

	@Override
	public String unitName() {
		return "m";
	}
}
