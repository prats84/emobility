/**
 * This class is generated by jOOQ
 */
package jooq.steve.db;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.steve.db.tables.Chargebox;
import jooq.steve.db.tables.Connector;
import jooq.steve.db.tables.ConnectorMetervalue;
import jooq.steve.db.tables.ConnectorStatus;
import jooq.steve.db.tables.Reservation;
import jooq.steve.db.tables.SchemaVersion;
import jooq.steve.db.tables.Transaction;
import jooq.steve.db.tables.User;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stevedb extends SchemaImpl {

	private static final long serialVersionUID = -1975608272;

	/**
	 * The reference instance of <code>stevedb</code>
	 */
	public static final Stevedb STEVEDB = new Stevedb();

	/**
	 * No further instances allowed
	 */
	private Stevedb() {
		super("stevedb");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Chargebox.CHARGEBOX,
			Connector.CONNECTOR,
			ConnectorMetervalue.CONNECTOR_METERVALUE,
			ConnectorStatus.CONNECTOR_STATUS,
			Reservation.RESERVATION,
			SchemaVersion.SCHEMA_VERSION,
			Transaction.TRANSACTION,
			User.USER);
	}
}
