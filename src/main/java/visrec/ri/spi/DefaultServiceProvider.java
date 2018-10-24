package visrec.ri.spi;

import javax.visrec.spi.BuilderService;
import javax.visrec.spi.ClassifierService;
import javax.visrec.spi.ImageFactoryService;
import javax.visrec.spi.ServiceProvider;

/**
 * @author Kevin Berendsen
 */
public final class DefaultServiceProvider extends ServiceProvider {

    /**
     * Get the {@link BuilderService}
     * @return {@link BuilderService}
     */
    @Override
    public BuilderService getBuilderService() {
        return new DefaultBuilderService();
    }

    /**
     * Get the {@link ClassifierService}
     * @return {@link ClassifierService}
     */
    @Override
    public ClassifierService getClassifierService() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get the {@link ImageFactoryService}
     * @return {@link ImageFactoryService}
     */
    @Override
    public ImageFactoryService getImageFactoryService() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}