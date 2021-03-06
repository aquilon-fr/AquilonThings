package fr.aquilon.minecraft.aquilonthings.utils;

import fr.aquilon.minecraft.aquilonthings.modules.IModule;
import fr.aquilon.minecraft.utils.JSONExportable;

/**
 * Created on 14/07/2017.
 *
 * @author Billi
 */
public interface AquilonEvent<T extends IModule> extends JSONExportable {
    void call(T m);
}
