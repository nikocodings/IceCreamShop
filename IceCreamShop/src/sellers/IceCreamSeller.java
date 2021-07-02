package sellers;

import Eatables.*;

public interface IceCreamSeller extends Profitable {

    Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException;

    IceRocket orderIceRocket() throws NoMoreIceCreamException;

    Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException;

}
