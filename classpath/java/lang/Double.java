package java.lang;

public final class Double extends Number {
  public static final Class TYPE = Class.forCanonicalName("D");

  private final double value;

  public Double(String value) {
    this.value = parseDouble(value);
  }

  public Double(double value) {
    this.value = value;
  }

  public static Double valueOf(double value) {
    return new Double(value);
  }

  public boolean equals(Object o) {
    return o instanceof Double && ((Double) o).value == value;
  }

  public int hashCode() {
    long v = doubleToRawLongBits(value);
    return (int) ((v >> 32) ^ (v & 0xFF));
  }

  public String toString() {
    return toString(value);
  }

  public static String toString(double v) {
    return "todo";
  }

  public byte byteValue() {
    return (byte) value;
  }

  public short shortValue() {
    return (short) value;
  }

  public int intValue() {
    return (int) value;
  }

  public long longValue() {
    return (long) value;
  }

  public float floatValue() {
    return (float) value;
  }

  public double doubleValue() {
    return value;
  }

  public static double parseDouble(String s) {
    // todo
    return 0.0;
  }

  public static native long doubleToRawLongBits(double value);

  public static native double longBitsToDouble(long bits);
}