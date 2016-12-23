package length;

/**
 * Created by 10180885 on 16-4-29.
 */
public abstract class Length {

	protected int length;

	public Length(int length) {
		this.length = length;
	}

	public abstract int base();

	public abstract String unitName();

	public boolean eq(Length other) {
		return this.base() == other.base();
	}

	public boolean lt(Length other) {
		return this.base() < other.base();
	}

	public boolean gt(Length other) {
		return this.base() > other.base();
	}

	public String thransform(int base) {
		int mCount = base/100;
		int dmCount = base%100/10;
		int cmCount = base%10;
		return new M(mCount).alias() + new DM(dmCount).alias() + new CM(cmCount).alias();
	}

	public String convert() {
		return thransform(base());
	}

	public String alias() {
		if(length == 0) return "";
		return String.valueOf(length) + this.unitName();

	}

	public String add(Length other) {
		return thransform(this.base() + other.base());
	}
}