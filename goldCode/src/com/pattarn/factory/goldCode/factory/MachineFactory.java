package com.pattarn.factory.goldCode.factory;

import com.pattarn.factory.goldCode.domain.Machine;

/**
 * Created by 10180885 on 16-1-22.
 */
public abstract class MachineFactory {
    public abstract java.util.List<Machine> create(int sum);

    protected enum Brand{
        AUDI, BMW, Passat,
    }

    protected enum Name{
        A4, A6, B420,
    }

    protected enum DriveType{
        electric_power, gasoline_power,
    }

    protected enum Type{
        car, bus,
    }
}
