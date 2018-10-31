package com.google.gwt.user.client.rpc.core.java.sql;

import java.sql.Timestamp;

import com.google.gwt.user.client.rpc.CustomFieldSerializer;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

import lv.proofit.gwtext.common.serialization.date.DateParseException;
import lv.proofit.gwtext.common.serialization.date.DateTimeFormatterFactory;

/**
 * Custom field serializer for {@link java.sql.Timestamp}.
 * <p>
 * Class overloads GWT's Date_CustomFieldSerializer. Mechanism of the GWT's custom serialization dictates that this
 * class must be named this way, in this specific package and with all its static methods for compilation
 * to be successful.
 */
@SuppressWarnings("unused")
public final class Timestamp_CustomFieldSerializer extends CustomFieldSerializer<Timestamp> {

  public static void deserialize(SerializationStreamReader streamReader, Timestamp instance) {
  }

  public static Timestamp instantiate(SerializationStreamReader streamReader) throws SerializationException {
    try {
      return new Timestamp(DateTimeFormatterFactory.get().parse(streamReader.readString()).getTime());
    } catch (DateParseException e) {
      throw new SerializationException(e);
    }
  }

  public static void serialize(SerializationStreamWriter streamWriter, Timestamp instance)
          throws SerializationException {
    streamWriter.writeString(DateTimeFormatterFactory.get().format(instance));
  }

  @Override
  public void deserializeInstance(SerializationStreamReader streamReader, Timestamp instance) {
    deserialize(streamReader, instance);
  }

  @Override
  public boolean hasCustomInstantiateInstance() {
    return true;
  }

  @Override
  public Timestamp instantiateInstance(SerializationStreamReader streamReader) throws SerializationException {
    return instantiate(streamReader);
  }

  @Override
  public void serializeInstance(SerializationStreamWriter streamWriter, Timestamp instance)
          throws SerializationException {
    serialize(streamWriter, instance);
  }
}