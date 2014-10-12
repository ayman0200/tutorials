/**
 * This class is generated by jOOQ
 */
package spring.jooq.dao.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends org.jooq.impl.UpdatableRecordImpl<spring.jooq.dao.generated.tables.records.UsersRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -180227344;

	/**
	 * Setter for <code>user_mgmt.users.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>user_mgmt.users.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>user_mgmt.users.username</code>.
	 */
	public void setUsername(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>user_mgmt.users.username</code>.
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>user_mgmt.users.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>user_mgmt.users.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>user_mgmt.users.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>user_mgmt.users.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>user_mgmt.users.address_id</code>.
	 */
	public void setAddressId(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>user_mgmt.users.address_id</code>.
	 */
	public java.lang.Integer getAddressId() {
		return (java.lang.Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return spring.jooq.dao.generated.tables.Users.USERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return spring.jooq.dao.generated.tables.Users.USERS.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return spring.jooq.dao.generated.tables.Users.USERS.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return spring.jooq.dao.generated.tables.Users.USERS.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return spring.jooq.dao.generated.tables.Users.USERS.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value2(java.lang.String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value3(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value4(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value5(java.lang.Integer value) {
		setAddressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UsersRecord
	 */
	public UsersRecord() {
		super(spring.jooq.dao.generated.tables.Users.USERS);
	}

	/**
	 * Create a detached, initialised UsersRecord
	 */
	public UsersRecord(java.lang.Integer id, java.lang.String username, java.lang.String password, java.lang.String email, java.lang.Integer addressId) {
		super(spring.jooq.dao.generated.tables.Users.USERS);

		setValue(0, id);
		setValue(1, username);
		setValue(2, password);
		setValue(3, email);
		setValue(4, addressId);
	}
}