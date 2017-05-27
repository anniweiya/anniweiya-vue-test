package cn.anniweiya.appserver.security;


import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class ModelBase implements Serializable {

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

}
