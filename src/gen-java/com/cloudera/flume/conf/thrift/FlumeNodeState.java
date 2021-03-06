/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.flume.conf.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum FlumeNodeState implements TEnum {
  HELLO(0),
  IDLE(1),
  CONFIGURING(2),
  ACTIVE(3),
  ERROR(4),
  LOST(5),
  DECOMMISSIONED(6);

  private static final Map<Integer, FlumeNodeState> BY_VALUE = new HashMap<Integer,FlumeNodeState>() {{
    for(FlumeNodeState val : FlumeNodeState.values()) {
      put(val.getValue(), val);
    }
  }};

  private final int value;

  private FlumeNodeState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static FlumeNodeState findByValue(int value) { 
    return BY_VALUE.get(value);
  }
}
