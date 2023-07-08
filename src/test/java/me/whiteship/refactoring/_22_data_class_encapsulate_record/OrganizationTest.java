package me.whiteship.refactoring._22_data_class_encapsulate_record;

import me.whiteship.refactoring._22_data_class._42_encapsulate_record.Organization;
import org.junit.jupiter.api.Test;

public class OrganizationTest {

  @Test
  void name() {
    Organization organization = new Organization("keesun", "USA");
    organization.name();
  }
}
