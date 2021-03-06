package designPatterns.immutable;

public final class ImmutableString implements Reverseable {
	private String firstName;
	private String lastName;	

	public ImmutableString(String firstName, String lastName) {
		super();
		this.firstName = new String(firstName);
		this.lastName = new String(lastName);
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableString other = (ImmutableString) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}

	public Reverseable reverse() {
		String reversedFirstName = new StringBuilder(firstName).reverse().toString();
		String reversedLastName = new StringBuilder(lastName).reverse().toString();
		Reverseable result = new ImmutableString(reversedFirstName, reversedLastName);
		return result;		
	}

}
