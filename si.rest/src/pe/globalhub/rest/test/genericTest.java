package pe.globalhub.rest.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

import pe.globalhub.rest.db.Sql;
import pe.globalhub.rest.db.customer;

public class genericTest {

	@Test
	public void hayDataDeCustomers() {
        String count = Sql.getCampo("SELECT count(UUIDCustomer) FROM `grantia`.`customer` ");
		assert(Integer.parseInt(count)>0);
	}
	
	@Test
	public void hayDataDeCuentas() {
        String count = Sql.getCampo("SELECT count(accointid) FROM `grantia`.`account` ");
		assert(Integer.parseInt(count)>0);
	}
	
	@Test
	public void hayDataDeMiddle() {
        String count = Sql.getCampo("SELECT count(id) FROM `grantia`.`customeracc` ");
		assert(Integer.parseInt(count)>0);
	}

}
