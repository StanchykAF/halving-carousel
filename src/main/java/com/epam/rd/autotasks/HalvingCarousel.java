package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run(){
        //throw new UnsupportedOperationException();
        if (getFlagRun() == 1) {
            return null;
        }
        setFlagRun((byte) 1);
        return new CarouselRun(getContainer(), getI(), 1);
    }


}
