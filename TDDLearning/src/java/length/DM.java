package length;

/**
 * Created by 10180885 on 16-5-6.
 */
public class DM extends Length {
	public DM(int length) {
		super(length);
	}

	@Override
	public int base() {
		return 10 * length;
	}

	@Override
	public String unitName() {
		return "dm";
	}
}
