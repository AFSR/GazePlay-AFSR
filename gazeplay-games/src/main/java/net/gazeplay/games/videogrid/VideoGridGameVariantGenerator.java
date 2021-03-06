package net.gazeplay.games.videogrid;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.gazeplay.commons.gamevariants.DimensionGameVariant;
import net.gazeplay.commons.gamevariants.IGameVariant;
import net.gazeplay.commons.gamevariants.generators.IGameVariantGenerator;

import java.util.Set;

public class VideoGridGameVariantGenerator implements IGameVariantGenerator {
    @Override
    public Set<IGameVariant> getVariants() {
        return Sets.newLinkedHashSet(Lists.newArrayList(

            new DimensionGameVariant(2, 1),

            new DimensionGameVariant(2, 2),

            new DimensionGameVariant(3, 3),

            new DimensionGameVariant(4, 4)

        ));
    }
}
