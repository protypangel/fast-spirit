package org.baraka.fast.spirit.json;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonTest {
    @Test public void convertClassToJson () {
        String json = "{\"doubled\":4,\"f\":5.5,\"l\":5,\"b\":true,\"listStr\":[\"str\"],\"listInteger\":[5],\"listDoubled\":[5.5],\"listF\":[5.5],\"listL\":[5],\"listB\":[true],\"arrayStr\":[\"str\"],\"arrayInteger\":[5],\"arrayDoubled\":[5.5],\"arrayF\":[5.5],\"arrayL\":[5],\"arrayB\":[true],\"MapStrStr\":{\"str\":\"str\"},\"MapStrInteger\":{\"str\":5},\"MapStrDoubled\":{\"str\":5.5},\"MapStrF\":{\"str\":5.5},\"MapStrL\":{\"str\":5},\"MapStrB\":{\"str\":true},\"MapIntegerStr\":{\"5\":\"str\"},\"MapIntegerInteger\":{\"5\":5},\"MapIntegerDoubled\":{\"5\":5.5},\"MapIntegerF\":{\"5\":5.5},\"MapIntegerL\":{\"5\":5},\"MapIntegerB\":{\"5\":true},\"MapDoubleStr\":{\"5.5\":\"str\"},\"MapDoubleInteger\":{\"5.5\":5},\"MapDoubleDoubled\":{\"5.5\":5.5},\"MapDoubleF\":{\"5.5\":5.5},\"MapDoubleL\":{\"5.5\":5},\"MapDoubleB\":{\"5.5\":true},\"MapFloatStr\":{\"5.5\":\"str\"},\"MapFloatInteger\":{\"5.5\":5},\"MapFloatDoubled\":{\"5.5\":5.5},\"MapFloatF\":{\"5.5\":5.5},\"MapFloatL\":{\"5.5\":5},\"MapFloatB\":{\"5.5\":true},\"MapLongStr\":{\"5\":\"str\"},\"MapLongInteger\":{\"5\":5},\"MapLongDoubled\":{\"5\":5.5},\"MapLongF\":{\"5\":5.5},\"MapLongL\":{\"5\":5},\"MapLongB\":{\"5\":true},\"MapBooleanStr\":{\"true\":\"str\"},\"MapBooleanInteger\":{\"true\":5},\"MapBooleanDoubled\":{\"true\":5.5},\"MapBooleanF\":{\"true\":5.5},\"MapBooleanL\":{\"true\":5},\"MapBooleanB\":{\"true\":true},\"setStr\":[\"str\"],\"setInteger\":[5],\"setDoubled\":[5.5],\"setF\":[5.5],\"setL\":[5],\"setB\":[true],\"nested\":{\"str\":\"str\",\"integer\":5,\"doubled\":5.5,\"f\":5.5,\"l\":5,\"b\":true}}";
        NormalClass normal = NormalClass.init();
        System.err.println(JsonConvertor.toJson(normal));
        test(JsonConvertor.fromJson(json, NormalClass.class));
    }
    public void test (NormalClass normal) {
        Assertions.assertEquals(normal.getDoubled(), 4.0);
    }
}
