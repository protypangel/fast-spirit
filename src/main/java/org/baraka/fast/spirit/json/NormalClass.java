package org.baraka.fast.spirit.json;

import lombok.Data;

import java.util.*;

@Data
public class NormalClass {
    public @JsonIgnore("b") String str;
    public @JsonIgnore("getB()") int integer;
    public @JsonIgnore("nested.getB()") double doubled;
    public @JsonIgnore("nested.b") float f;
    public @JsonIgnore long l;
    public @JsonGet boolean b;

    List<String> listStr;
    List<Integer> listInteger;
    List<Double> listDoubled;
    List<Float> listF;
    List<Long> listL;
    List<Boolean> listB;

    String[] arrayStr;
    int[]  arrayInteger;
    double[] arrayDoubled;
    float[] arrayF;
    long[] arrayL;
    boolean[] arrayB;

    Map<String, String> MapStrStr;
    Map<String, Integer> MapStrInteger;
    Map<String, Double> MapStrDoubled;
    Map<String, Float> MapStrF;
    Map<String, Long> MapStrL;
    Map<String, Boolean> MapStrB;

    HashMap<Integer, String> MapIntegerStr;
    HashMap<Integer, Integer> MapIntegerInteger;
    HashMap<Integer, Double> MapIntegerDoubled;
    HashMap<Integer, Float> MapIntegerF;
    HashMap<Integer, Long> MapIntegerL;
    HashMap<Integer, Boolean> MapIntegerB;

    Map<Double, String> MapDoubleStr;
    Map<Double, Integer> MapDoubleInteger;
    Map<Double, Double> MapDoubleDoubled;
    Map<Double, Float> MapDoubleF;
    Map<Double, Long> MapDoubleL;
    Map<Double, Boolean> MapDoubleB;

    Map<Float, String> MapFloatStr;
    Map<Float, Integer> MapFloatInteger;
    Map<Float, Double> MapFloatDoubled;
    Map<Float, Float> MapFloatF;
    Map<Float, Long> MapFloatL;
    Map<Float, Boolean> MapFloatB;

    Map<Long, String> MapLongStr;
    Map<Long, Integer> MapLongInteger;
    Map<Long, Double> MapLongDoubled;
    Map<Long, Float> MapLongF;
    Map<Long, Long> MapLongL;
    Map<Long, Boolean> MapLongB;

    Map<Boolean, String> MapBooleanStr;
    Map<Boolean, Integer> MapBooleanInteger;
    Map<Boolean, Double> MapBooleanDoubled;
    Map<Boolean, Float> MapBooleanF;
    Map<Boolean, Long> MapBooleanL;
    Map<Boolean, Boolean> MapBooleanB;

    Set<String> setStr;
    Set<Integer> setInteger;
    Set<Double> setDoubled;
    Set<Float> setF;
    Set<Long> setL;
    Set<Boolean> setB;

    NestedClass nested;

    public boolean getB() {
        return false;
    }

    public static NormalClass init () {
        NormalClass normalClass = new NormalClass();
        normalClass.str = "str";
        normalClass.integer = 5;
        normalClass.doubled = 5.5;
        normalClass.f = 5.5F;
        normalClass.l = 5L;
        normalClass.b = true;

        normalClass.listStr = Arrays.asList(normalClass.str);
        normalClass.listInteger = Arrays.asList(normalClass.integer);
        normalClass.listDoubled = Arrays.asList(normalClass.doubled);
        normalClass.listF = Arrays.asList(normalClass.f);
        normalClass.listL = Arrays.asList(normalClass.l);
        normalClass.listB = Arrays.asList(normalClass.b);

        normalClass.arrayStr = new String[] {normalClass.str};
        normalClass.arrayInteger = new int[] {normalClass.integer};
        normalClass.arrayDoubled = new double[] {normalClass.doubled};
        normalClass.arrayF = new float[]{normalClass.f};
        normalClass.arrayL = new long[] {normalClass.l};
        normalClass.arrayB = new boolean[] {normalClass.b};

        normalClass.MapStrStr  = new HashMap<>() {{ put(normalClass.str, normalClass.str); }};
        normalClass.MapStrInteger = new HashMap<>() {{ put(normalClass.str, normalClass.integer); }};
        normalClass.MapStrDoubled = new HashMap<>() {{ put(normalClass.str, normalClass.doubled); }};
        normalClass.MapStrF = new HashMap<>() {{ put(normalClass.str, normalClass.f); }};
        normalClass.MapStrL = new HashMap<>() {{ put(normalClass.str, normalClass.l); }};
        normalClass.MapStrB = new HashMap<>() {{ put(normalClass.str, normalClass.b); }};

        normalClass.MapIntegerStr = new HashMap<>() {{ put(normalClass.integer, normalClass.str); }};
        normalClass.MapIntegerInteger = new HashMap<>() {{ put(normalClass.integer, normalClass.integer); }};
        normalClass.MapIntegerDoubled = new HashMap<>() {{ put(normalClass.integer, normalClass.doubled); }};
        normalClass.MapIntegerF = new HashMap<>() {{ put(normalClass.integer, normalClass.f); }};
        normalClass.MapIntegerL = new HashMap<>() {{ put(normalClass.integer, normalClass.l); }};
        normalClass.MapIntegerB = new HashMap<>() {{ put(normalClass.integer, normalClass.b); }};

        normalClass.MapDoubleStr = new HashMap<>() {{ put(normalClass.doubled, normalClass.str); }};
        normalClass.MapDoubleInteger = new HashMap<>() {{ put(normalClass.doubled, normalClass.integer); }};
        normalClass.MapDoubleDoubled = new HashMap<>() {{ put(normalClass.doubled, normalClass.doubled); }};
        normalClass.MapDoubleF = new HashMap<>() {{ put(normalClass.doubled, normalClass.f); }};
        normalClass.MapDoubleL = new HashMap<>() {{ put(normalClass.doubled, normalClass.l); }};
        normalClass.MapDoubleB = new HashMap<>() {{ put(normalClass.doubled, normalClass.b); }};

        normalClass.MapFloatStr = new HashMap<>() {{ put(normalClass.f, normalClass.str); }};
        normalClass.MapFloatInteger = new HashMap<>() {{ put(normalClass.f, normalClass.integer); }};
        normalClass.MapFloatDoubled = new HashMap<>() {{ put(normalClass.f, normalClass.doubled); }};
        normalClass.MapFloatF = new HashMap<>() {{ put(normalClass.f, normalClass.f); }};
        normalClass.MapFloatL = new HashMap<>() {{ put(normalClass.f, normalClass.l); }};
        normalClass.MapFloatB = new HashMap<>() {{ put(normalClass.f, normalClass.b); }};

        normalClass.MapLongStr = new HashMap<>() {{ put(normalClass.l, normalClass.str); }};
        normalClass.MapLongInteger = new HashMap<>() {{ put(normalClass.l, normalClass.integer); }};
        normalClass.MapLongDoubled = new HashMap<>() {{ put(normalClass.l, normalClass.doubled); }};
        normalClass.MapLongF = new HashMap<>() {{ put(normalClass.l, normalClass.f); }};
        normalClass.MapLongL = new HashMap<>() {{ put(normalClass.l, normalClass.l); }};
        normalClass.MapLongB = new HashMap<>() {{ put(normalClass.l, normalClass.b); }};

        normalClass.MapBooleanStr = new HashMap<>() {{ put(normalClass.b, normalClass.str); }};
        normalClass.MapBooleanInteger = new HashMap<>() {{ put(normalClass.b, normalClass.integer); }};
        normalClass.MapBooleanDoubled = new HashMap<>() {{ put(normalClass.b, normalClass.doubled); }};
        normalClass.MapBooleanF = new HashMap<>() {{ put(normalClass.b, normalClass.f); }};
        normalClass.MapBooleanL = new HashMap<>() {{ put(normalClass.b, normalClass.l); }};
        normalClass.MapBooleanB = new HashMap<>() {{ put(normalClass.b, normalClass.b); }};

        normalClass.setStr = Set.of(normalClass.str);
        normalClass.setInteger = Set.of(normalClass.integer);
        normalClass.setDoubled = Set.of(normalClass.doubled);
        normalClass.setF = Set.of(normalClass.f);
        normalClass.setL = new HashSet<>() {{ add(normalClass.l); }};
        normalClass.setB = new HashSet<>() {{ add(normalClass.b); }};

        normalClass.nested = NestedClass.init();

        return  normalClass;
    }
    public static String jsonWithTabulationAndReturnLine () {
        return
        "{\n" +
                "\t\"str\": \"str\",\n" +
                "\t\"integer\": 5,\n" +
                "\t\"doubled\": 5.5,\n" +
                "\t\"f\": 5.5,\n" +
                "\t\"l\": 5,\n" +
                "\t\"b\": true,\n" +
                "\t\"listStr\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"str\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"listInteger\": [\n" +
                "\t\t{\n" +
                "\t\t\t5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"listDoubled\": [\n" +
                "\t\t{\n" +
                "\t\t\t5.5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"listF\": [\n" +
                "\t\t{\n" +
                "\t\t\t5.5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"listL\": [\n" +
                "\t\t{\n" +
                "\t\t\t5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"listB\": [\n" +
                "\t\t{\n" +
                "\t\t\ttrue\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"arrayStr\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"str\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"arrayInteger\": [\n" +
                "\t\t{\n" +
                "\t\t\t5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"arrayDoubled\": [\n" +
                "\t\t{\n" +
                "\t\t\t5.5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"arrayF\": [\n" +
                "\t\t{\n" +
                "\t\t\t5.5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"arrayL\": [\n" +
                "\t\t{\n" +
                "\t\t\t5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"arrayB\": [\n" +
                "\t\t{\n" +
                "\t\t\ttrue\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"MapStrStr\": {\n" +
                "\t\t\"str\": \"str\"\n" +
                "\t},\n" +
                "\t\"MapStrInteger\": {\n" +
                "\t\t\"str\": 5\n" +
                "\t},\n" +
                "\t\"MapStrDoubled\": {\n" +
                "\t\t\"str\": 5.5\n" +
                "\t},\n" +
                "\t\"MapStrF\": {\n" +
                "\t\t\"str\": 5.5\n" +
                "\t},\n" +
                "\t\"MapStrL\": : {\n" +
                "\t\t\"str\": 5\n" +
                "\t},\n" +
                "\t\"MapStrB\": : {\n" +
                "\t\t\"str\": true\n" +
                "\t},\n" +
                "\t\"MapIntegerStr\": {\n" +
                "\t\t\"5\": \"str\"\n" +
                "\t},\n" +
                "\t\"MapIntegerInteger\": {\n" +
                "\t\t\"5\": 5\n" +
                "\t},\n" +
                "\t\"MapIntegerDoubled\": {\n" +
                "\t\t\"5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapIntegerF\": {\n" +
                "\t\t\"5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapIntegerL\": : {\n" +
                "\t\t\"5\": 5\n" +
                "\t},\n" +
                "\t\"MapIntegerB\": : {\n" +
                "\t\t\"5\": true\n" +
                "\t},\n" +
                "\t\"MapDoubleStr\": {\n" +
                "\t\t\"5.5\": \"str\"\n" +
                "\t},\n" +
                "\t\"MapDoubleInteger\": {\n" +
                "\t\t\"5.5\": 5\n" +
                "\t},\n" +
                "\t\"MapDoubleDoubled\": {\n" +
                "\t\t\"5.5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapDoubleF\": {\n" +
                "\t\t\"5.5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapDoubleL\": : {\n" +
                "\t\t\"5.5\": 5\n" +
                "\t},\n" +
                "\t\"MapDoubleB\": : {\n" +
                "\t\t\"5.5\": true\n" +
                "\t},\n" +
                "\t\"MapFloatStr\": {\n" +
                "\t\t\"5.5\": \"str\"\n" +
                "\t},\n" +
                "\t\"MapFloatInteger\": {\n" +
                "\t\t\"5.5\": 5\n" +
                "\t},\n" +
                "\t\"MapFloatDoubled\": {\n" +
                "\t\t\"5.5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapFloatF\": {\n" +
                "\t\t\"5.5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapFloatL\": : {\n" +
                "\t\t\"5.5\": 5\n" +
                "\t},\n" +
                "\t\"MapFloatB\": : {\n" +
                "\t\t\"5.5\": true\n" +
                "\t},\n" +
                "\t\"MapLongStr\": {\n" +
                "\t\t\"5.5\": \"str\"\n" +
                "\t},\n" +
                "\t\"MapLongInteger\": {\n" +
                "\t\t\"5.5\": 5\n" +
                "\t},\n" +
                "\t\"MapLongDoubled\": {\n" +
                "\t\t\"5.5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapLongF\": {\n" +
                "\t\t\"5.5\": 5.5\n" +
                "\t},\n" +
                "\t\"MapLongL\": {\n" +
                "\t\t\"5.5\": 5\n" +
                "\t},\n" +
                "\t\"MapLongB\": {\n" +
                "\t\t\"5.5\": true\n" +
                "\t},\n" +
                "\t\"MapBooleanStr\": {\n" +
                "\t\t\"true\": \"str\"\n" +
                "\t},\n" +
                "\t\"MapBooleanInteger\": {\n" +
                "\t\t\"true\": 5\n" +
                "\t},\n" +
                "\t\"MapBooleanDoubled\": {\n" +
                "\t\t\"true\": 5.5\n" +
                "\t},\n" +
                "\t\"MapBooleanF\": {\n" +
                "\t\t\"true\": 5.5\n" +
                "\t},\n" +
                "\t\"MapBooleanL\": {\n" +
                "\t\t\"true\": 5\n" +
                "\t},\n" +
                "\t\"MapBooleanB\": {\n" +
                "\t\t\"true\": true\n" +
                "\t},\n" +
                "\t\"setStr\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"str\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"setInteger\": [\n" +
                "\t\t{\n" +
                "\t\t\t5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"setDoubled\": [\n" +
                "\t\t{\n" +
                "\t\t\t5.5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"setF\": [\n" +
                "\t\t{\n" +
                "\t\t\t5.5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"setL\": [\n" +
                "\t\t{\n" +
                "\t\t\t5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"setB\": [\n" +
                "\t\t{\n" +
                "\t\t\ttrue\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
    }
}
